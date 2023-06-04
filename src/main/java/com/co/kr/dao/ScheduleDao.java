package com.co.kr.dao;

import java.util.ArrayList;

import com.co.kr.data.DateData;
import com.co.kr.dto.ScheduleDto;

public interface ScheduleDao {

	public int schedule_add(ScheduleDto scheduleDto);
	public int before_schedule_add_search(ScheduleDto scheduleDto);
	public ArrayList<ScheduleDto> schedule_list(DateData dateData);
	
	// 수정, 삭제를 위한 리스트 불러오기
	//조회
	public ScheduleDto get(int idx);
	
	//수정
	public int update(ScheduleDto scheduleDto);
	
	//삭제
	public int delete(ScheduleDto scheduleDto);
}
