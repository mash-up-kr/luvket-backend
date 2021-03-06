package com.mashup.luvket.domain.constant.status;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserStatus {
	
	ALONE("혼자"),
	INVITING("초대중"),
	INVITED("초대완료"),
	ACCEPTED("수락완료"),
	DELETE("삭제");

	private String description;

}
