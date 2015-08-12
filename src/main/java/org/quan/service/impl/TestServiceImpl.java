package org.quan.service.impl;

import java.util.List;

import org.quan.dao.TestDao;
import org.quan.model.Test;
import org.quan.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
