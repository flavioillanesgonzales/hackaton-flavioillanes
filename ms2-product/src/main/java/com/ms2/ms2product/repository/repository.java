package com.ms2.ms2product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ms2.ms2product.model.product;
public interface repository extends JpaRepository<product, Long> {
}
