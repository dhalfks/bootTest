package com.example.demo.service;

import com.example.demo.dto.BoardDTO;
import com.example.demo.entity.Board;

public interface BoardService {

	Long register(BoardDTO bdto);
	
	
	default Board convertDtoToEntity(BoardDTO bdto) {
		return Board.builder()
				.bno(bdto.getBno())
				.title(bdto.getTitle())
				.writer(bdto.getWriter())
				.content(bdto.getContent())
				.build();
	}
	
	default BoardDTO convertEntityToDto(Board board) {
		return BoardDTO.builder()
				.bno(board.getBno())
				.title(board.getTitle())
				.writer(board.getWriter())
				.content(board.getContent())
				.regAt(board.getRegAt())
				.modAt(board.getModAt()).build();
	}

}
