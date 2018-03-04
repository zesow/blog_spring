package net.thebogus.board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import net.thebogus.board.vo.ReplyVO;
import net.thebogus.board.vo.Criteria;

@Repository
public class ReplyDaoImpl implements ReplyDao {

	@Inject
	private SqlSession sqlSession;
	private static final String namespace ="net.thebogus.replyMapper";
	
	@Override
	public List<ReplyVO> list(Integer bNo) throws Exception {
		
		return sqlSession.selectList(namespace + ".listAll", bNo);
	}

	@Override
	public void create(ReplyVO reply) throws Exception {
		sqlSession.insert(namespace + ".create", reply);
	}

	@Override
	public void update(ReplyVO reply) throws Exception {
		sqlSession.update(namespace + ".update", reply);
	}

	@Override
	public void delete(Integer rNo) throws Exception {
		sqlSession.delete(namespace + ".delete", rNo);
	}

	@Override
	public List<ReplyVO> listPage(Integer bNo, Criteria cri) throws Exception {
		Map<String, Object> paramMap = new HashMap<>();

		paramMap.put("bNo", bNo);
		paramMap.put("cri", cri);

		return sqlSession.selectList(namespace + ".listPage", paramMap);
	}

	@Override
	public int count(Integer bNo) throws Exception {
		return sqlSession.selectOne(namespace + ".count", bNo);
	}

	@Override
	public ReplyVO one(Integer rNo) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace +".one",rNo);
	}
}
