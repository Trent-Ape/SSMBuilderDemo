package com.konka.service;

import java.util.List;

import com.konka.model.Test;

public interface TestService {
	public List<Test> query(Test test);
	public void insert(Test test);
}
