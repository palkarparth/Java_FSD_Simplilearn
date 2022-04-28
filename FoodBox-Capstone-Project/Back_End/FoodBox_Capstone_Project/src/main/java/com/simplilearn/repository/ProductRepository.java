package com.simplilearn.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import com.simplilearn.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	// all products

	Page<Product> findAllByOrderByNameAsc(Pageable pageable);

	Page<Product> findAllByOrderByDateCreatedDesc(Pageable pageable);

	// by Cuisine

	Page<Product> findByCuisine(@RequestParam("cuisine") int cuisine, Pageable pageable);

	Page<Product> findByCuisineOrderByNameAsc(@RequestParam("cuisine") int cuisine, Pageable pageable);

	Page<Product> findByCuisineOrderByDateCreatedDesc(@RequestParam("cuisine") int cuisine, Pageable pageable);

	// for searching

	Page<Product> findByNameContaining(@RequestParam("name") String name, Pageable pageable);

	Page<Product> findByNameContainingOrderByNameAsc(@RequestParam("name") String name, Pageable pageable);

	Page<Product> findByNameContainingOrderByDateCreatedDesc(@RequestParam("name") String name, Pageable pageable);
}