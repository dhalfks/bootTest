package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.dto.BoardDTO;
import com.example.demo.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/board")
@Controller
public class BoardController {
	private final BoardService bsv;
	
	@PostMapping("/register")
	public String register(BoardDTO bdto, RedirectAttributes re) {
		Long bno = bsv.register(bdto);
		re.addFlashAttribute("register", bno);
		return "redirect:/board/list";
	}
	
	@GetMapping("/register")
	public void register() {
		log.info(">>> register - GET");
	}
	

}
