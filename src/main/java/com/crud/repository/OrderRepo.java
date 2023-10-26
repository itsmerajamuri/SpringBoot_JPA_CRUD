package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.entity.Order;

public interface OrderRepo extends JpaRepository<Order, Integer>{

}
