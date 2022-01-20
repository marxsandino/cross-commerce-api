package com.cross.commerce.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ChallengerOrdenacao {
	
	public List<BigDecimal> order(List<BigDecimal> challengeNumbers){
		
		ArrayList<BigDecimal> newList = new ArrayList<BigDecimal>();
		ArrayList<BigDecimal> otherChallenger = new ArrayList<>(challengeNumbers);
		
		for(int i=0; i < challengeNumbers.size(); i++) {
			BigDecimal menor = otherChallenger.get(0);
			for(int j=1; j < otherChallenger.size(); j++) {
				if(otherChallenger.get(j).compareTo(menor) < 0) {
					menor = otherChallenger.get(j);
				}
			}
			newList.add(menor);
			otherChallenger.remove(menor);
		}
		
		return newList;
		
	}
	
}
