package com.konka.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.konka.dao.TestDao;
import com.konka.model.Test;
import com.konka.service.TestService;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	TestDao testDao;
	
	public List<Test> query(Test test) {
		return testDao.query(test);
	}

	public void insert(Test test) {
		testDao.insert(test);
	}

}
