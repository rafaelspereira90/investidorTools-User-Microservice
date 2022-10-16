package br.com.investidortools.user.enums;

import lombok.Getter;

@Getter
public enum UserTypeEnum {

	I("Investidor"),
	A("Analista");

	private String description;
	
	UserTypeEnum(String description) {
		this.description = description;
	}
}
