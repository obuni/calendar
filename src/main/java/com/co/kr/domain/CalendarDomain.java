package com.co.kr.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder(builderMethodName="builder")
public class CalendarDomain {
	
	private String mbcalendarNo;
	private String mbcalendarTitle;
	private String mbcalendarMemo;
	private String mbcalendarStart;
	private String mbcalendarEnd;

}
