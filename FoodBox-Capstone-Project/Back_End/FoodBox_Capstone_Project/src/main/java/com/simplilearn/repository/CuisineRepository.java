package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.entity.Cuisine;

public interface CuisineRepository extends JpaRepository<Cuisine, Long> {

}
