package com.kh.breaktime.detail.model.service;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.breaktime.detail.model.dao.DetailDAO;
import com.kh.breaktime.detail.model.vo.CategoryCode;
import com.kh.breaktime.detail.model.vo.Detail;

@Service
public class DetailServiceImpl implements DetailService{
	
	@Autowired
	private DetailDAO detailDao;
	
	public ArrayList<CategoryCode> selectCategoryCodeList(){
		return detailDao.selectCategoryCodeList();
	}
	
	public void selectDetailList(String category, Map<String, Object> map) {
		ArrayList<Detail> list = detailDao.selectDetailList(category);
		
		map.put("list", list);
	}
	
	public void searchDetailList(Map<String, Object> paramMap, Map<String, Object> map) {
		ArrayList<Detail> list = detailDao.searchDetailList(paramMap);
		
		map.put("list", list);
	}
	

}
