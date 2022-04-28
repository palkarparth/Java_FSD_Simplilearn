package com.simplilearn.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import com.simplilearn.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	Page<User> findByUsername(@RequestParam("username") String username, Pageable pageable);

}
