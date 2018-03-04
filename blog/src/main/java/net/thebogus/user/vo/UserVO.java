package net.thebogus.user.vo;

import java.util.Date;

public class UserVO {
	private String id;
	private String passwd;
	private String name;
	private String mail;
	private Date regDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", passwd=" + passwd + ", name=" + name + ", mail=" + mail + ", regDate=" + regDate
				+ "]";
	}

	
}
