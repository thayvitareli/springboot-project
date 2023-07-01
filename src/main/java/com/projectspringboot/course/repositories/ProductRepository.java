package com.projectspringboot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspringboot.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
