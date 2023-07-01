package com.projectspringboot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspringboot.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
