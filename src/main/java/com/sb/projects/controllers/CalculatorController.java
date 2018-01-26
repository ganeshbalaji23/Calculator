package com.sb.projects.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sb.projects.services.AddService;
import com.sb.projects.services.DivisionService;
import com.sb.projects.services.MultiplyService;
import com.sb.projects.services.SubtractService;

@RestController
public class CalculatorController {
	
	@Autowired
	private AddService addService;
	@Autowired
	private SubtractService subtractService;
	@Autowired
	private MultiplyService multiplyService;
	@Autowired
	private DivisionService divisionService;
	
	@RequestMapping(method=RequestMethod.POST, value="/add/{numA}/{numB}")
	public int addValues(@PathVariable int numA, @PathVariable int numB) {
		return addService.addValues(numA, numB);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/subtract/{numA}/{numB}")
	public int subtractValues(@PathVariable int numA, @PathVariable int numB) {
		return subtractService.subtractValues(numA, numB);
	}

	@RequestMapping(method=RequestMethod.POST, value="/multiply/{numA}/{numB}")
	public int multiplyValues(@PathVariable int numA, @PathVariable int numB) {
		return multiplyService.multiplyValues(numA, numB);
	}

	@RequestMapping(method=RequestMethod.POST, value="/division/{numA}/{numB}")
	public int divisionValues(@PathVariable int numA, @PathVariable int numB) {
		return divisionService.divisionValues(numA, numB);
	}
	
}
