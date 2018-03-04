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
	@Inject
	private BoardService service;
	
	@RequestMapping(value="/insert", method=RequestMethod.GET)
	public void insertGET(BoardVO boardVO,Model model) throws Exception{
		logger.info("register get.....");
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public String insertPOST(BoardVO boardVO,RedirectAttributes rttr) throws Exception{
		logger.info("register post...");
		logger.info(boardVO.toString());
		service.insertArticle(boardVO);
		rttr.addFlashAttribute("result","success");
//		return "/board/success";
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
//		return "/board/success";
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
//		return "/board/success";
		return "redirect:/board/"+ boardName;
	}
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public void listCri(Criteria cri,Model model) throws Exception{
		logger.info("criteria");
		model.addAttribute("list",service.selectArticleCriteria(cri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.countPaging(cri));
		model.addAttribute("pageMaker",pageMaker);
	}
	
	
	
	
	
	
	
//각 게시판들 
	@RequestMapping(value="/projects", method = RequestMethod.GET)
	public void projectsList(Criteria cri,Model model) throws Exception{
		logger.info("criteria");
		cri.setBoardno(1);
		model.addAttribute("list",service.selectArticleCriteria(cri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.countPaging(cri));
		model.addAttribute("pageMaker",pageMaker);
	}
	
	@RequestMapping(value="/algorithm", method = RequestMethod.GET)
	public void algorithmList(Criteria cri,Model model) throws Exception{
		logger.info("criteria");
		
		cri.setBoardno(2);
		
		model.addAttribute("list",service.selectArticleCriteria(cri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.countPaging(cri));
		model.addAttribute("pageMaker",pageMaker);
	}
	
	@RequestMapping(value="/finance", method = RequestMethod.GET)
	public void financeList(Criteria cri,Model model) throws Exception{
		logger.info("criteria");
		
		cri.setBoardno(3);
		
		model.addAttribute("list",service.selectArticleCriteria(cri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.countPaging(cri));
		model.addAttribute("pageMaker",pageMaker);
	}
	
	@RequestMapping(value="/law", method = RequestMethod.GET)
	public void lawList(Criteria cri,Model model) throws Exception{
		logger.info("criteria");
		
		cri.setBoardno(4);
		
		model.addAttribute("list",service.selectArticleCriteria(cri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.countPaging(cri));
		model.addAttribute("pageMaker",pageMaker);
	}
	
	@RequestMapping(value="/photo", method = RequestMethod.GET)
	public void photoList(Criteria cri,Model model) throws Exception{
		logger.info("criteria");
		
		cri.setBoardno(5);
		
		model.addAttribute("list",service.selectArticleCriteria(cri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.countPaging(cri));
		model.addAttribute("pageMaker",pageMaker);
	}
	
	@RequestMapping(value="/food", method = RequestMethod.GET)
	public void foodList(Criteria cri,Model model) throws Exception{
		logger.info("criteria");
		
		cri.setBoardno(6);
		
		model.addAttribute("list",service.selectArticleCriteria(cri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.countPaging(cri));
		model.addAttribute("pageMaker",pageMaker);
	}
	
}
