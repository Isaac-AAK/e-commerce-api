package com.iaktech.dto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iaktech.domain.Customers;
@Repository
public interface CustomerRepository extends JpaRepository<Customers, Long>{

}
