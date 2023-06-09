package com.co.kr.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder(builderMethodName="builder")
public class CalendarDomain {
	
	private String calendarNo;
	private String calendarTitle;
	private String calendarMemo;
	private String calendarStart;
	private String calendarEnd;

}
