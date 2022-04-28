package com.simplilearn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cuisine")
public class Cuisine {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "cuisine_name")
    private String cuisine_name;

	public Cuisine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cuisine(Long id, String cuisine_name) {
		super();
		this.id = id;
		this.cuisine_name = cuisine_name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCuisine_name() {
		return cuisine_name;
	}

	public void setCuisine_name(String cuisine_name) {
		this.cuisine_name = cuisine_name;
	}
    
    

}
