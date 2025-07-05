package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Photo;


public interface PhotoService {

	Photo createPhoto(Photo photo);
	
	Photo updatePhoto(Photo photo);
	
	Photo getPhotoById(Long id);
	
	List<Photo>getAllPhoto();
	
	void deletePhoto(Long id);
}
