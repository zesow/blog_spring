package net.thebogus.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import net.thebogus.board.dao.ReplyDao;
import net.thebogus.board.vo.ReplyVO;
import net.thebogus.board.vo.Criteria;

@Service
public class ReplyServiceImpl implements ReplyService {

	
	@Inject
	private ReplyDao replyDAO;
	
	@Override
	public void addReply(ReplyVO reply) throws Exception {
		replyDAO.create(reply);
	}

	@Override
	public List<ReplyVO> listReply(Integer bNo) throws Exception {
		return replyDAO.list(bNo);
	}

	@Override
	public void modifyReply(ReplyVO reply) throws Exception {
		replyDAO.update(reply);
	}

	@Override
	public void removeReply(Integer rNo) throws Exception {
		replyDAO.delete(rNo);
	}

	@Override
	public List<ReplyVO> listReplyPage(Integer bNo, Criteria cri) throws Exception {
		return replyDAO.listPage(bNo, cri);
	}

	@Override
	public int count(Integer bNo) throws Exception {
		return replyDAO.count(bNo);
	}

	@Override
	public ReplyVO one(Integer rNo) throws Exception {
		// TODO Auto-generated method stub
		return replyDAO.one(rNo);
	}
}
