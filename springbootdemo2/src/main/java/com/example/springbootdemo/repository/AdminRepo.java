package com.example.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootdemo.entity.AdminDetails;

public interface AdminRepo extends JpaRepository<AdminDetails, String> {

}
