package net.thebogus.blog;

import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.thebogus.board.dao.BoardDao;
import net.thebogus.board.dao.ReplyDao;
import net.thebogus.board.vo.ReplyVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/*.xml"})
public class CommentDaoTest {
	private final static Logger logger = LoggerFactory.getLogger(CommentDaoTest.class);
	@Inject
	private ReplyDao dao;
	
	@Test
	public void testInsert() throws Exception{
		ReplyVO vo = new ReplyVO();
		vo.setbNo(0);
		vo.setReplyer("gus");
		vo.setReplyText("test to reply");
		dao.create(vo);
	}
	
	@Test
	public void testList() throws Exception{
		
		List<ReplyVO> l = dao.list(44);
        Iterator<ReplyVO> iterator = l.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
	}
}
