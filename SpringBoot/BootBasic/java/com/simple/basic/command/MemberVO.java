package com.simple.basic.command;

import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberVO {
	
	@Pattern(message="아이디는 영문(소문자,대문자), 숫자 포함 8자 이상 ",regexp="[a-zA-Z0-9]{8,}")
	private String id;
	@Pattern(message="비밀번호는 영문, 특수문자, 숫자 포함 8자 이상",regexp="^(?=.*[a-zA-Z])(?=.*\\d)(?=.*\\W).{8,20}$")
	private String pw;

}
