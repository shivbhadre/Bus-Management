package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Busdetails;
import com.example.demo.service.Busservice;

@RestController
public class Buscontroller {
	@Autowired
	Busservice busservice;

	@PostMapping("bus")
	public String add(@RequestBody Busdetails busdetails) {
		busservice.add(busdetails);
		return "bus details added";

	}

	@GetMapping("bus/{busno}")
	private Busdetails getBusDetails(@PathVariable int busno) {
		// TODO Auto-generated method stub
		return busservice.getBusDetails(busno);

	}

	@DeleteMapping("bus/{busno}")
	public String deleteBus(@PathVariable int busno) {
		busservice.deleteBus(busno);

		return "bus deleted by id " + busno;
	}

	public static void main(String[] args) {
		
	}

}
