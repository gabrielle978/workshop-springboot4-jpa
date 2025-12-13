package com.gbassServices.project.services;

import com.gbassServices.project.entities.Product;
import com.gbassServices.project.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() { //camada de serviço
        return repository.findAll(); //repository
    }

    public Product findByID(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
