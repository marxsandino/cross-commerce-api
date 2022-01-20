package com.cross.commerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cross.commerce.dto.ChallengeNumbersDto;
import com.cross.commerce.service.ChallengeNumbersService;

@RestController
@RequestMapping("/challenge/numbers")
public class ChallengeNumbersController {
	
	private ChallengeNumbersService challengeNumbersService;

	public ChallengeNumbersController(ChallengeNumbersService challengeNumbersService) {
		this.challengeNumbersService = challengeNumbersService;
	}
	
	@GetMapping
	public ChallengeNumbersDto getNumbers() {
		return challengeNumbersService.getNumbers();
	}

}
