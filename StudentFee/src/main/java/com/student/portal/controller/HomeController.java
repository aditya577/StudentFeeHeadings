package com.student.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.portal.entity.Fee;
import com.student.portal.service.FeeService;

@Controller
public class HomeController {
	
	@Autowired
	private FeeService service;
	
	@RequestMapping(value = "/")
	public String home(Model map) {
		map.addAttribute("message", "You landed here");
		map.addAttribute("title","Student Fee | Index");
		return "welcome";
	}

	@RequestMapping(value = "/home")
	public String welcome(Model map) {
		map.addAttribute("message", "Welcome to the STS 4.10");
		map.addAttribute("title", "Student Fee | Home");
		return "welcome";
	}
	
	@PostMapping(value = "/save")
	@ResponseBody
	public Fee saveFee(@RequestBody Fee fee) {
		return service.saveFee(fee);
	}
	
	@PostMapping(value = "/save/fee/list")
	public List<Fee> saveFeeList(@RequestBody List<Fee> fees) {
		return service.saveFeeList(fees);
	} 
	
	@GetMapping(value = "/get/all/fees")
	public List<Fee> getAll(){
		return service.getAllFees();
	}
	
	@GetMapping(value = "/get/fee/id/{id}")
	public Fee getFeeById(@PathVariable Long id) {
		return service.getFeeById(id);
	}
	
	@GetMapping(value = "/get/fee/name/{feeName}")
	public Fee getFeeByName(@PathVariable String feeName) {
		return service.getFeeByFeeName(feeName);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public String deleteById(@PathVariable Long id) {
		return service.deleteById(id);
	}
	
	@PutMapping(value = "/update")
	public Fee updateFee(@RequestBody Fee fee) {
		return service.updateFee(fee);
	}
}
