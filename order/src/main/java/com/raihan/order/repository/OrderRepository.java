package com.raihan.order.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.raihan.order.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long> {
    List<Orders> findByPelangganId(Long pelangganId);
}