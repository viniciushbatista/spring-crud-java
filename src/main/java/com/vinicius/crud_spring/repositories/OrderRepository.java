package com.vinicius.crud_spring.repositories;

import com.vinicius.crud_spring.entities.Order;
import com.vinicius.crud_spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
