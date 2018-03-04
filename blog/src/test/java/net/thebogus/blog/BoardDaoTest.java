package net.thebogus.blog;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.thebogus.board.dao.BoardDao;
import net.thebogus.board.vo.BoardVO;
import net.thebogus.board.vo.Criteria;
import net.thebogus.user.dao.UserDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/*.xml"})
public class BoardDaoTest {
	private final static Logger logger = LoggerFactory.getLogger(BoardDaoTest.class);
	@Inject
	private BoardDao dao;
	
//	@Test
//	public void testInsert() throws Exception{
//		BoardVO vo = new BoardVO();
//		vo.setTitle("타이틀");
//		vo.setWriter("안녕하세");
//		vo.setContent("콘텐츠");
//		vo.setBoardno("2");
//		dao.insertArticle(vo);
//	}
	
//	@Test
//	public void testListPage() throws Exception {
//		int page = 1;
//		List<BoardVO> list = dao.selectArticleListPage(page);
//		for (BoardVO boardVO : list) {
//			logger.info(boardVO.getIdx() + ":" + boardVO.getTitle());
//		}
//	}
	
	@Test
	public void testListCriteria() throws Exception {
		Criteria cri = new Criteria();
		cri.setPage(1);
		cri.setPerPageNum(20);

		List<BoardVO> list = dao.selectArticleCriteria(cri);

		for (BoardVO boardVO : list) {
			logger.info(boardVO.getIdx() + ":" + boardVO.getTitle());
		}
	}
}