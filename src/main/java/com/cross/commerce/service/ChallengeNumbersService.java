package com.cross.commerce.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cross.commerce.client.ChallengeNumbersClient;
import com.cross.commerce.dto.ChallengeNumbersDto;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ChallengeNumbersService {
	
	private ChallengeNumbersClient challengeNumbersClient;
	
	private ChallengerOrdenacao challengerOrdenacao;

	public ChallengeNumbersService(
			ChallengeNumbersClient challengeNumbersClient,
			ChallengerOrdenacao challengerOrdenacao) {
		this.challengeNumbersClient = challengeNumbersClient;
		this.challengerOrdenacao = challengerOrdenacao;
	}
	
	public ChallengeNumbersDto getNumbers() {
		
		List<BigDecimal> allNumbers = new ArrayList<>();
		boolean execute = true;
		int i = 1;
		while (execute) {
			log.info("page: {}", i);
			
			try {
				ChallengeNumbersDto response = challengeNumbersClient.getNumbers(i);
				
				i++;
				
//				response.getNumbers().forEach(n -> result.getNumbers().add(n));
				allNumbers.addAll(response.getNumbers());
				if(response.getNumbers().isEmpty()) {
					execute=false;
				}
			} catch (Exception e) {
				log.info("Erro ao buscar page: {}", i);
			}
			
			
		}
		
		List<BigDecimal> orderNumbers = challengerOrdenacao.order(allNumbers);
		ChallengeNumbersDto result = new ChallengeNumbersDto();
		result.setNumbers(orderNumbers);
		
		return result;
	}

}
