package com.co.kr.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CalendarVo {
	private String calendarNo;
	private String calendarTitle;
	private String calendarMemo;
	private String calendarStart;
	private String calendarEnd;
	
	 public String getcalendarNo() {
	        return calendarNo;
	    }
	 public void setcalendarNo(String calendarNo) {
	        this.calendarNo = calendarNo;
	    }
	 public String getcalendarTitle() {
	        return calendarTitle;
	    }
	 public void setcalendarTitle(String calendarTitle) {
	        this.calendarTitle= calendarTitle;
	    }
	 public String getcalendarMemo() {
	        return calendarMemo;
	    }
	 public void setcalendarMemo(String calendarMemo) {
	        this.calendarMemo = calendarMemo;
	    }
	 public String getcalendarStart() {
	        return calendarStart;
	    }
	 public void setcalendarStart(String calendarStart) {
	        this.calendarStart = calendarStart;
	    }
	 public String getcalendarEnd() {
	        return calendarEnd;
	    }
	 public void setcalendarEnd(String calendarEnd) {
	        this.calendarEnd = calendarEnd;
	    }
	 

}
