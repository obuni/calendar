package com.co.kr.service;


import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.kr.mapper.CalendarMapper;
import com.co.kr.vo.CalendarVo;




@Service
public class CalendarService {
	@Autowired(required=true)
    public static CalendarMapper mapper;

    public static List<CalendarVo> calendarList() {
        return mapper.calendarList(null);
    }

}
