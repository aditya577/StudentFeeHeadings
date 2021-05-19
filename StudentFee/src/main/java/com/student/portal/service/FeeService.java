package com.student.portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.portal.entity.Fee;
import com.student.portal.repository.FeeRepository;

@Service
public class FeeService {

	@Autowired
	private FeeRepository repository;

	public Fee saveFee(Fee fee) {
		return repository.save(fee);
	}

	public List<Fee> saveFeeList(List<Fee> fees) {
		return repository.saveAll(fees);
	}

	public List<Fee> getAllFees() {
		return repository.findAll();
	}

	public Fee getFeeById(Long id) {
		return repository.findById(id).orElse(null);
	}

	public Fee getFeeByFeeName(String feeName) {
		return repository.findByFeeName(feeName);
	}

	public String deleteById(Long id) {
		repository.deleteById(id);
		return "delete-success for id: " + id;
	}

	public Fee updateFee(Fee fee) {
		Fee prevFee = repository.findById(fee.getId()).orElse(null);

		if (prevFee != null) {
			prevFee = new Fee(fee.getId(), fee.getFeeName(), fee.getPeriodicity(), fee.isFineApplicable(),
					fee.isConcessionApplicable(), fee.isRefundable(), fee.getAccountHead(), fee.isActive());
		}
		return repository.save(prevFee);
	}

}
