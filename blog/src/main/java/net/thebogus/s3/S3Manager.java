package net.thebogus.s3;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.S3ResponseMetadata;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.DeleteObjectsRequest;
import com.amazonaws.services.s3.model.DeleteObjectsResult;
import com.amazonaws.services.s3.model.MultiObjectDeleteException;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.DeleteObjectsRequest.KeyVersion;

public class S3Manager {
	private static final String ACCESS = "AKIAIFVNXGXEQOFXRCAA";
	private static final String SECRET = "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";
	private static final String amazonPath = "https://s3.ap-northeast-2.amazonaws.com/gus-blog-image/image/";
	
	static BasicAWSCredentials creds = new BasicAWSCredentials(ACCESS, SECRET); 
	static AmazonS3 s3Client = AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(creds)).build();

	private static ObjectMetadata meta;
	
	public String saveUploadedFiles(MultipartFile file) throws IOException {
		if (file.isEmpty()) {
			System.out.println("file not found");
		}
		byte[] bytes = file.getBytes();
		String randomFileName = UUID.randomUUID() + file.getOriginalFilename();
		sendFiles(randomFileName, bytes);
		return amazonPath + randomFileName;
	}
	public static boolean sendFiles(String name, byte[] file) {
		InputStream is = new ByteArrayInputStream(file);
		try {
			PutObjectRequest req = makeRequest(is, name);
			System.out.println("name : " + name);
			s3Client.putObject(req);
			S3ResponseMetadata md = s3Client.getCachedResponseMetadata(req);
			System.out.println("Host ID: " + md.getHostId() + " RequestID: " + md.getRequestId());

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public static PutObjectRequest makeRequest(InputStream is, String fileName) {
		ObjectMetadata uploadMetaData = new ObjectMetadata();
		return new PutObjectRequest("gus-blog-image/image", fileName, is, uploadMetaData).withCannedAcl(CannedAccessControlList.PublicRead);
	}
}
