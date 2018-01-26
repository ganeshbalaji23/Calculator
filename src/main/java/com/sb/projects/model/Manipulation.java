package com.sb.projects.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Data
@Component
public class Manipulation {
	
	@Id
	@GeneratedValue
	private long id;
	private int numA;
	private int numB;
	private String operator;
	private int optVal;
	
}
