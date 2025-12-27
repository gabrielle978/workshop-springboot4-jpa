package com.gbassServices.project.repositories;

import com.gbassServices.project.entities.OrderItem;
import com.gbassServices.project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
