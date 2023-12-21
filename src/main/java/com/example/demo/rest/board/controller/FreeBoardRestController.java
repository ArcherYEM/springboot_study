package com.example.demo.rest.board.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FreeBoardRestController {
	
	@GetMapping("/board/free/list")
	public Map<String, Object> getBoardList() {
		
		Map map = new HashMap();
		map.put("result", "success");
		map.put("data", Arrays.asList(new String[] {"제목1","제목2","제목3"}));
		
		return map;
	}

}
