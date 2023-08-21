package com.example.demo.board.repos;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Board;
import com.example.demo.repository.BoardRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class BoardRepoTest {
	
	@Autowired
	private BoardRepository boardRepo;
	
	@Test
	public void insertDummyTest() {
		
//		for (int j = 0; j < 1000; j++) {
//		Board board = new Board();
//		board.setTitle("This is Title of " + j);
//		board.setContent("This Content of " + j);
//		board.setWriter("Tester"+j+"@tester.com");
//		boardRepos.save(board);
//	}
		
		IntStream.rangeClosed(1, 100).forEach(i->{
			Board board = Board.builder()
					.title("This is Title of "+i)
					.content("this Contnet if "+i)
					.writer("Tester"+i+"@tester.com").build();
			log.info(">>> register dummy", boardRepo.save(board));
		});
	}

}
