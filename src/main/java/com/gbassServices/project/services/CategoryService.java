package com.gbassServices.project.services;

import com.gbassServices.project.entities.Category;
import com.gbassServices.project.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() { //camada de serviço
        return repository.findAll(); //repository
    }

    public Category findByID(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
