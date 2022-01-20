package com.cross.commerce.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cross.commerce.dto.ChallengeNumbersDto;

@FeignClient(name="challengeNumbers", url="${challenge-numbers.url}")
public interface ChallengeNumbersClient {

	@GetMapping
	public ChallengeNumbersDto getNumbers(@RequestParam Integer page);
	
}
