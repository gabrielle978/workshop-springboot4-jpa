package com.gbassServices.project.repositories;

import com.gbassServices.project.entities.Order;
import com.gbassServices.project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
