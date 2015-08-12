package com.konka.dao;

import java.util.List;

import com.konka.model.Test;


public interface TestDao {
	public void insert(Test test);
	public List<Test> query(Test test);
}