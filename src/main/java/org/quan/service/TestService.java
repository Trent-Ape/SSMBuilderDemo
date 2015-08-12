package org.quan.service;

import java.util.List;

import org.quan.model.Test;

public interface TestService {
	public List<Test> query(Test test);
	public void insert(Test test);
}
