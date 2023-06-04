package com.co.kr.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.co.kr.vo.CalendarVo;

@Repository
@Mapper
public interface CalendarMapper {
	
	 List<CalendarVo> calendarList(Map<String, String> map);

}
