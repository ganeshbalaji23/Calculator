package com.sb.projects.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.projects.model.Manipulation;

@Repository
public interface CalculatorRepository extends JpaRepository<Manipulation, Long> {
	

}
