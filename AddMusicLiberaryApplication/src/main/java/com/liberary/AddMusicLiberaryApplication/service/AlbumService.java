package com.liberary.AddMusicLiberaryApplication.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.liberary.AddMusicLiberaryApplication.dao.AlbumRepository;
import com.liberary.AddMusicLiberaryApplication.model.Album;

@Service
@Transactional
public class AlbumService {

	private final AlbumRepository albumRepository;

	public AlbumService(AlbumRepository albumRepository) {
		super();
		this.albumRepository = albumRepository;
	}

	public List<Album> findAll(){
		List<Album> albums = new ArrayList<>();
		for (Album album : albumRepository.findAll()) {
			albums.add(album);
		}
		return albums;
	}

	public void save(Album album) {
		albumRepository.save(album);
	}
	
	public void delete(int id) {
		albumRepository.delete(id);
	}
}
