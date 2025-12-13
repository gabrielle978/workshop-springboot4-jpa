package com.gbassServices.project.repositories;

import com.gbassServices.project.entities.Product;
import com.gbassServices.project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
