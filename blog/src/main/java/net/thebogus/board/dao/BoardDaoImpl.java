package net.thebogus.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import net.thebogus.board.vo.BoardVO;
import net.thebogus.board.vo.Criteria;

@Repository
public class BoardDaoImpl implements BoardDao {

	@Inject
	private SqlSession sqlSession;
	private static final String namespace ="net.thebogus.boardMapper";
	@Override
	public void insertArticle(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace+".insertArticle",boardVO);	
	}

	@Override
	public BoardVO selectArticle(int idx) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace+".selectArticle",idx);
	}

	@Override
	public List<BoardVO> selectArticleList() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".selectArticleList");
	}

	@Override
	public void updateArticle(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update(namespace+".updateArticle",boardVO);
	}

	@Override
	public void deleteArticle(int idx) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(namespace+".deleteArticle",idx);
	}

	@Override
	public List<BoardVO> selectArticleListPage(int page) throws Exception {
		// TODO Auto-generated method stub
		if(page <= 0)
			page = 1;
		page = (page - 1) * 10;
		
		return sqlSession.selectList(namespace+".selectArticleListPage",page);
	}

	@Override
	public List<BoardVO> selectArticleCriteria(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace + ".selectArticleCriteria",cri);
	}

	@Override
	public int countPaging(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace+".countPaging",cri);
	}

	@Override
	public List<BoardVO> selectNewArticle() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace + ".selectNewArticle");
	}


}
