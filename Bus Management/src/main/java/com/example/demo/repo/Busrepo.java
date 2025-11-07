package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Busdetails;

public interface Busrepo extends JpaRepository<Busdetails, Integer>{

}
