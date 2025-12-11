package com.gbassServices.project.services;

import com.gbassServices.project.entities.Order;
import com.gbassServices.project.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() { //camada de serviço
        return repository.findAll(); //repository
    }

    public Order findByID(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
