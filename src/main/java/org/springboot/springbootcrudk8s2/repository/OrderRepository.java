package org.springboot.springbootcrudk8s2.repository;


import org.springboot.springbootcrudk8s2.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
