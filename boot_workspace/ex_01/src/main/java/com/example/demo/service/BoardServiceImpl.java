package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.BoardDTO;
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

}
