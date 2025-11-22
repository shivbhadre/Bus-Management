package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverController {

	@GetMapping("api/driver")
	public String getDriver()
	{
		return "Driver is Saved in DB";
	}
}
