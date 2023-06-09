package com.co.kr.service;

import java.util.List;

import com.co.kr.mapper.CalendarMapper;
import com.co.kr.vo.CalendarVo;

public class CalendarServiceImpl implements CalendarService{
	
	 public static CalendarMapper mapper;

	    public List<CalendarVo> calendarList() {
	        return mapper.calendarList(null);
	    }


}
