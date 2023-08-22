package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.dto.BoardDTO;
import com.example.demo.entity.Board;
import com.example.demo.repository.BoardRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class BoardServiceImpl implements BoardService{
	
	private final BoardRepository repository;

	@Override
	public Long register(BoardDTO bdto) {
		log.info(">>> register service", bdto);
		return repository.save(convertDtoToEntity(bdto)).getBno();
	}

	@Override
	public List<BoardDTO> getList() {
		List<Board> list = repository.findAll();
		List<BoardDTO> dtoList = new ArrayList<>();
		for(Board board : list) {
			dtoList.add(convertEntityToDto(board));
		}
		return dtoList;
	}

	@Override
	public BoardDTO getDetail(Long bno) {
		log.info(">> Board detail", bno);
		Optional<Board> option =  repository.findById(bno);
		return option.isPresent() ? convertEntityToDto(option.get()) : null;
	}

}
