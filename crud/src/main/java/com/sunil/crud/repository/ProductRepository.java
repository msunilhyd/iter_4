package com.sunil.crud.repository;

import com.sunil.crud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository <Product, Integer> {

    Optional<Object> findByName(String name);
}
