package net.thebogus.board.service;

import java.util.List;

import net.thebogus.board.vo.ReplyVO;
import net.thebogus.board.vo.Criteria;

public interface ReplyService {
	public void addReply(ReplyVO reply) throws Exception;

	public ReplyVO one(Integer rNo) throws Exception;
	
	public List<ReplyVO> listReply(Integer bNo) throws Exception;

	public void modifyReply(ReplyVO reply) throws Exception;

	public void removeReply(Integer rNo) throws Exception;
	
	public List<ReplyVO> listReplyPage(Integer bNo, Criteria cri) throws Exception;
	
	public int count(Integer bNo) throws Exception;
}
