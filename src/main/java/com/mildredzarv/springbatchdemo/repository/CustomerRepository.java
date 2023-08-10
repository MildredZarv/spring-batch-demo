package com.mildredzarv.springbatchdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mildredzarv.springbatchdemo.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
