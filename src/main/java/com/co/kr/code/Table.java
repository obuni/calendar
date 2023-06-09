package com.co.kr.code;

import lombok.Getter;

@Getter
public enum Table {
	
	CALENDAR("calendar");
	
	private String table;
	
	Table(String table){
		this.table = table;
	}


}
