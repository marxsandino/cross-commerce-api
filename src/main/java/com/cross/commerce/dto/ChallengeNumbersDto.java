package com.cross.commerce.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChallengeNumbersDto {

	private List<BigDecimal> numbers = new ArrayList<>();
	
}
