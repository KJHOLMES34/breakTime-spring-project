package com.kh.breaktime.detail.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.breaktime.detail.model.dao.DetailDAO;
import com.kh.breaktime.detail.model.vo.CategoryCode;
import com.kh.breaktime.detail.model.vo.Detail;

@Service
public class DetailServiceImpl implements DetailService {

	@Autowired
	private DetailDAO detailDao;
	
	@Autowired
    private SqlSession sqlSession;

	public ArrayList<CategoryCode> selectCategoryCodeList() {
		return detailDao.selectCategoryCodeList();
	}

	public void selectDetailList(String category, Map<String, Object> map) {
		ArrayList<Detail> list = detailDao.selectDetailList(category);
		map.put("list", list);
	}

	public void getFilteredData(String category, List<String> prices, List<String> reserves, List<String> options, Map<String, Object> map) {
		ArrayList<Detail> list = detailDao.getFilteredData(category, prices, reserves, options);
		map.put("list", list);
	}
	
	public void getAreaData(String category, String area, Map<String, Object> map) {
		ArrayList<Detail> list = detailDao.getAreaData(category, area);
		map.put("list", list);
	}

	public void searchDetailList(Map<String, Object> paramMap, Map<String, Object> map) {
		ArrayList<Detail> list = detailDao.searchDetailList(paramMap);
		map.put("list", list);
	}

}
