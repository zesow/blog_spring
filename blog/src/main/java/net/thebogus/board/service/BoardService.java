package net.thebogus.board.service;

import java.util.List;

import net.thebogus.board.vo.BoardVO;
import net.thebogus.board.vo.Criteria;

public interface BoardService {
	public void insertArticle(BoardVO boardVO) throws Exception;
	
	public BoardVO selectArticle(int idx) throws Exception;
	public List<BoardVO> selectArticleList() throws Exception;
	public List<BoardVO> selectArticleListPage(int page) throws Exception;
	public List<BoardVO> selectArticleCriteria(Criteria cri) throws Exception;
//	public List<BoardVO> selectArticleCriteria_bno(Criteria cri,int boardno) throws Exception;
	public int countPaging(Criteria cri) throws Exception;
	
	public void updateArticle(BoardVO boardVO) throws Exception;
	
	public void deleteArticle(int idx) throws Exception;

	public List<BoardVO> selectNewArticle();
	
	
}
