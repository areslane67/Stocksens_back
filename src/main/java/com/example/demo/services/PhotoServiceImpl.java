package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Photo;
import com.example.demo.repositories.PhotoRepository;



@Service
public class PhotoServiceImpl implements PhotoService {

@Autowired 	
private PhotoRepository photoRepository;

@Override
public Photo createPhoto(Photo photo) {
    return photoRepository.save(photo);
}

@Override
public Photo updatePhoto(Photo photo) {
	return photoRepository.save(photo);
}
@Override
public Photo getPhotoById(Long id) {
    return photoRepository.findById(id).orElse(null);

}
@Override
public List<Photo> getAllPhoto(){
	return photoRepository.findAll();
}
@Override
public void deletePhoto(Long id) {
	photoRepository.deleteById(id);
}
}
