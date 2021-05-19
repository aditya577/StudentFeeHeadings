package com.student.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.portal.entity.Fee;

public interface FeeRepository extends JpaRepository<Fee, Long> {
	
	Fee findByFeeName(String feeName);
}
