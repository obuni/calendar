package com.co.kr.dao;

import java.util.ArrayList;
import java.util.Calendar;

import org.springframework.stereotype.Repository;

@Repository
public interface CalenDao {
	public ArrayList<Calendar> calenList();

}
