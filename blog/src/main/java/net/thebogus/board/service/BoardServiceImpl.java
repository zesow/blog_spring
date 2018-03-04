package net.thebogus.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import net.thebogus.board.dao.BoardDao;
import net.thebogus.board.vo.BoardVO;
import net.thebogus.board.vo.Criteria;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Inject
	private BoardDao boardDao;
	@Override
	public void insertArticle(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		boardDao.insertArticle(boardVO);
	}

	@Override
	public BoardVO selectArticle(int idx) throws Exception {
		// TODO Auto-generated method stub
		return boardDao.selectArticle(idx);
	}

	@Override
	public List<BoardVO> selectArticleList() throws Exception {
		// TODO Auto-generated method stub
		return boardDao.selectArticleList();
	}

	@Override
	public void updateArticle(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		boardDao.updateArticle(boardVO);
	}

	@Override
	public void deleteArticle(int idx) throws Exception {
		// TODO Auto-generated method stub
		boardDao.deleteArticle(idx);
	}

	@Override
	public List<BoardVO> selectArticleListPage(int page) throws Exception {
		// TODO Auto-generated method stub
		return boardDao.selectArticleListPage(page);
	}

	@Override
	public List<BoardVO> selectArticleCriteria(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return boardDao.selectArticleCriteria(cri);
	}

	@Override
	public int countPaging(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return boardDao.countPaging(cri);
	}

	@Override
	public List<BoardVO> selectNewArticle() {
		// TODO Auto-generated method stub
		return boardDao.selectNewArticle();
	}

//	@Override
//	public List<BoardVO> selectArticleCriteria_bno(Criteria cri,int boardno) throws Exception {
//		// TODO Auto-generated method stub
//		return boardDao.selectArticleCriteria_bno(cri,boardno);
//	}

}
