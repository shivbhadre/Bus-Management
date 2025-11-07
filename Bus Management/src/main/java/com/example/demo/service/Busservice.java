package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Busdetails;
import com.example.demo.repo.Busrepo;
@Service
public class Busservice {
@Autowired
Busrepo busrepo;
	
	public void add(Busdetails busdetails){
		busrepo.save(busdetails);
		}
	public Busdetails getBusDetails(int busno) {
		return busrepo.findById(busno).get();
	}
	
	
	public void deleteBus(int busno)
	{
		busrepo.deleteById(busno);
	}
	
}
