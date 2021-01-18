package com.sinobot.interview.repo;

import java.util.UUID;

import com.sinobot.interview.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
}
