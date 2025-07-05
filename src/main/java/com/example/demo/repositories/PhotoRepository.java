package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Photo;


public interface PhotoRepository extends JpaRepository<Photo, Long> {
	
}
