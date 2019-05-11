package com.itmayiedu.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FTLIndexController {

	@RequestMapping("/ftlIndex")
	public String ftlIndex(Map<String, Object>map) {
		map.put("age", "18");
		return "ftlIndex";
	}
}
