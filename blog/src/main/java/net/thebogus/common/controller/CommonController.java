package net.thebogus.common.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.thebogus.board.controller.BoardController;
import net.thebogus.board.service.BoardService;
import net.thebogus.board.vo.BoardVO;
import net.thebogus.board.vo.Criteria;
import net.thebogus.board.vo.PageMaker;

@Controller
@RequestMapping("/common/*")
public class CommonController {
	private static final Logger logger = LoggerFactory.getLogger(CommonController.class);
	
	@Inject
	private BoardService service;
	
	@RequestMapping(value="index", method = RequestMethod.GET)
	public void newArticles(Model model) throws Exception{
		logger.info("articles 플리");
		model.addAttribute("list",service.selectNewArticle());
		
	}
}
