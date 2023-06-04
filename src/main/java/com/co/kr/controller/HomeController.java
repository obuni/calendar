package com.co.kr.controller;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.co.kr.service.CalendarService;
import com.co.kr.vo.CalendarVo;



@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired(required=true)
	CalendarService calendarService;

	//일정보기
			@RequestMapping(value = "index", method = RequestMethod.GET)
			public ModelAndView getCalendarList(CalendarVo calendarDTO, ModelAndView mv, HttpServletRequest request) {
				
				
				
				
				List<CalendarVo> calendar = CalendarService.calendarList();
//				try {
//					calendar = calendarService.getCalendar();
//					request.setAttribute("calendarList", calendar);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
				
				Map<String, String> map = new HashMap();
				map.put("mbcalendarNo", calendarDTO.getcalendarNo());
				map.put("mbcalendarTitle", calendarDTO.getcalendarTitle());
				
				mv.setViewName("templates/index.html");
				mv.addObject("list", calendar);
				return mv;
			}
	
//	@RequestMapping(value = "/index")
//	public ModelAndView index() throws Exception{
//	    ModelAndView mav = new ModelAndView("test");
//
//	    List<CalendarVo> testList = CalendarService.calendarList();
//	    mav.addObject("list", testList);
//
//	    return mav;
}
