package net.thebogus.board.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.thebogus.board.service.BoardService;
import net.thebogus.board.vo.BoardVO;
import net.thebogus.board.vo.Criteria;
import net.thebogus.board.vo.PageMaker;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	private static final int PROJECTS = 1;
	private static final int ALGORITHM = 2;
	private static final int FINANCE = 3;
	private static final int LAW = 4;
	private static final int PHOTO = 5;
	private static final int FOOD = 6;
	private static final int BOOK = 7;
	private static final int FREE = 8;
	private static final int GAME = 9;
	private static final int MACHINE = 10;
	private static final int MAJOR = 11;
	private static final int MOVIE = 12;
	private static final int OTHERS = 13;
	
	@Inject
	private BoardService service;
	
	@RequestMapping(value="/insert", method=RequestMethod.GET)
	public void insertGET(BoardVO boardVO,Model model) throws Exception{
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public String insertPOST(BoardVO boardVO,RedirectAttributes rttr) throws Exception{
		logger.info("insert post...");
		
		service.insertArticle(boardVO);
		rttr.addFlashAttribute("result","success");
		return "redirect:/board/" + boardVO.getBoardName();
	}
	
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(int idx,Model model,@ModelAttribute("cri")Criteria cri) throws Exception{
		logger.info("show article...........");
		model.addAttribute(service.selectArticle(idx));
	}
	
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String remove(int idx,String boardName,RedirectAttributes rttr) throws Exception{
		logger.info("remove article...........");
		service.deleteArticle(idx);
		rttr.addFlashAttribute("result","success");
		return "redirect:/board/" + boardName;
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void modifyGET(int idx,Model model) throws Exception{
		model.addAttribute(service.selectArticle(idx));
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyPOST(BoardVO boardVO,String boardName,RedirectAttributes rttr) throws Exception{
		logger.info("modify article...........");
		service.updateArticle(boardVO);
		rttr.addFlashAttribute("result","success");
		return "redirect:/board/"+ boardName;
	}
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public void listCri(Criteria cri,Model model) throws Exception{
		logger.info("list articles....");
		model.addAttribute("list",service.selectArticleCriteria(cri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.countPaging(cri));
		model.addAttribute("pageMaker",pageMaker);
	}
	
	
	
	
	
	
	
//각 게시판들 
	@RequestMapping(value="/projects", method = RequestMethod.GET)
	public void projectsList(Criteria cri,Model model) throws Exception{
		
		cri.setBoardno(PROJECTS);
		model.addAttribute("list",service.selectArticleCriteria(cri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.countPaging(cri));
		model.addAttribute("pageMaker",pageMaker);
	}
	
	@RequestMapping(value="/algorithm", method = RequestMethod.GET)
	public void algorithmList(Criteria cri,Model model) throws Exception{
		
		
		cri.setBoardno(ALGORITHM);
		
		model.addAttribute("list",service.selectArticleCriteria(cri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.countPaging(cri));
		model.addAttribute("pageMaker",pageMaker);
	}
	
	@RequestMapping(value="/finance", method = RequestMethod.GET)
	public void financeList(Criteria cri,Model model) throws Exception{
		
		
		cri.setBoardno(FINANCE);
		
		model.addAttribute("list",service.selectArticleCriteria(cri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.countPaging(cri));
		model.addAttribute("pageMaker",pageMaker);
	}
	
	@RequestMapping(value="/law", method = RequestMethod.GET)
	public void lawList(Criteria cri,Model model) throws Exception{
		
		
		cri.setBoardno(LAW);
		
		model.addAttribute("list",service.selectArticleCriteria(cri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.countPaging(cri));
		model.addAttribute("pageMaker",pageMaker);
	}
	
	@RequestMapping(value="/photo", method = RequestMethod.GET)
	public void photoList(Criteria cri,Model model) throws Exception{
		
		
		cri.setBoardno(PHOTO);
		
		model.addAttribute("list",service.selectArticleCriteria(cri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.countPaging(cri));
		model.addAttribute("pageMaker",pageMaker);
	}
	
	@RequestMapping(value="/book", method = RequestMethod.GET)
	public void bookList(Criteria cri,Model model) throws Exception{
		
		
		cri.setBoardno(BOOK);
		
		model.addAttribute("list",service.selectArticleCriteria(cri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.countPaging(cri));
		model.addAttribute("pageMaker",pageMaker);
	}
	
	@RequestMapping(value="/free", method = RequestMethod.GET)
	public void freeList(Criteria cri,Model model) throws Exception{
		
		
		cri.setBoardno(FREE);
		
		model.addAttribute("list",service.selectArticleCriteria(cri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.countPaging(cri));
		model.addAttribute("pageMaker",pageMaker);
	}
	
	@RequestMapping(value="/game", method = RequestMethod.GET)
	public void gameList(Criteria cri,Model model) throws Exception{
		
		
		cri.setBoardno(GAME);
		
		model.addAttribute("list",service.selectArticleCriteria(cri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.countPaging(cri));
		model.addAttribute("pageMaker",pageMaker);
	}
	
	@RequestMapping(value="/machine", method = RequestMethod.GET)
	public void machineList(Criteria cri,Model model) throws Exception{
		
		
		cri.setBoardno(MACHINE);
		
		model.addAttribute("list",service.selectArticleCriteria(cri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.countPaging(cri));
		model.addAttribute("pageMaker",pageMaker);
	}
	
	@RequestMapping(value="/major", method = RequestMethod.GET)
	public void majorList(Criteria cri,Model model) throws Exception{
		
		
		cri.setBoardno(MAJOR);
		
		model.addAttribute("list",service.selectArticleCriteria(cri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.countPaging(cri));
		model.addAttribute("pageMaker",pageMaker);
	}
	
	@RequestMapping(value="/movie", method = RequestMethod.GET)
	public void movieList(Criteria cri,Model model) throws Exception{
		
		
		cri.setBoardno(MOVIE);
		
		model.addAttribute("list",service.selectArticleCriteria(cri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.countPaging(cri));
		model.addAttribute("pageMaker",pageMaker);
	}
	
	@RequestMapping(value="/others", method = RequestMethod.GET)
	public void othersList(Criteria cri,Model model) throws Exception{
		
		
		cri.setBoardno(OTHERS);
		
		model.addAttribute("list",service.selectArticleCriteria(cri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.countPaging(cri));
		model.addAttribute("pageMaker",pageMaker);
	}
	
	
}
