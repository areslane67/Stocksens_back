package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Photo;
import com.example.demo.services.PhotoService;

@RestController
@CrossOrigin
@RequestMapping("/api/Photo")

public class PhotoController {

	@Autowired

	private PhotoService photoService;

	@PostMapping("/add")

	public ResponseEntity<Photo> CreatePhoto(@RequestBody Photo photo) {
		Photo createdPhoto = photoService.createPhoto(photo);
	    return ResponseEntity.ok(createdPhoto);

	}
	@PutMapping("/{id}")

	public Photo updatePhoto(@PathVariable Long id , @RequestBody Photo photo){
		return photoService.updatePhoto(photo);
	}
	@GetMapping("/{id}")

	public Photo getPhotoById(@PathVariable Long id) {
		return photoService.getPhotoById(id);
	}
	@GetMapping("/all")

	public List<Photo> getAllPhoto(){
		return photoService.getAllPhoto();
	}
	@DeleteMapping("/{id}")

	public void deletePhoto(@PathVariable Long id) {
		photoService.deletePhoto(id);
	}
	
}
