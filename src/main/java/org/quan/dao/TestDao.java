package org.quan.dao;

import java.util.List;

import org.quan.model.Test;


public interface TestDao {
	public void insert(Test test);
	public List<Test> query(Test test);
}