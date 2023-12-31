package com.simple.basic.command;

import javax.validation.constraints.NotBlank;

import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemoVO {
	
	private Integer mno;
	@NotBlank
	@Pattern(message="메모는 5글자 이상이에요",regexp="[0-9가-힣a-zA-Z\\s\\.\\?\\!]{5,}")
	private String memo;
	@Pattern(message="전화번호는 ***-****-**** 형식입니다", regexp="^[0-9]{3}-[0-9]{4}-[0-9]{4}")
	private String phone;
	@Pattern(message="숫자 4자 입력하세요", regexp="^[0-9]{4}")
	private String pw;
	private String secret;
	

}
