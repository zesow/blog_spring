package net.thebogus.board.dao;

import java.util.List;

import net.thebogus.board.vo.ReplyVO;
import net.thebogus.board.vo.Criteria;
public interface ReplyDao {
	
	public List<ReplyVO> list(Integer bNo) throws Exception;
	
	public ReplyVO one(Integer rNo) throws Exception;

	public void create(ReplyVO reply) throws Exception;

	public void update(ReplyVO reply) throws Exception;

	public void delete(Integer rNo) throws Exception;
	
	public List<ReplyVO> listPage(Integer bNo,Criteria cri) throws Exception;
	
	public int count(Integer bNo) throws Exception;
}
