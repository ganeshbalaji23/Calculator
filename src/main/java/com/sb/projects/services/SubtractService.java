package com.sb.projects.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.projects.model.Manipulation;
import com.sb.projects.repository.CalculatorRepository;

@Service
public class SubtractService {

	@Autowired
	private Manipulation manipulation;
	
	@Autowired
	private CalculatorRepository repositoryDao;
	
	public int subtractValues(int a, int b) {
		
		int c = a-b;
		manipulation.setNumA(a);
		manipulation.setNumB(b);
		manipulation.setOperator("subtract");
		manipulation.setOptVal(c);
		repositoryDao.save(manipulation);
		return c;
	}

}
