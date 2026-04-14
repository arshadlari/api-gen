package com.example.api_gen;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

	@GetMapping("/status")
	public Map<String, Object> status() {
		return Map.of("success", true, "message", "Its working!");
	}

}