package com.liberary.AddMusicLiberaryApplication.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.liberary.AddMusicLiberaryApplication.dao.ArtistRepository;
import com.liberary.AddMusicLiberaryApplication.model.Artist;

@Service
@Transactional
public class ArtistService {

	private final ArtistRepository artistRepository;

	public ArtistService(ArtistRepository artistRepository) {
		super();
		this.artistRepository = artistRepository;
	}

	public List<Artist> findAll() {
		List<Artist> artists = new ArrayList<>();
		for (Artist artist : artistRepository.findAll()) {
			artists.add(artist);
		}
		return artists;
	}

	public void save(Artist artist) {
		artistRepository.save(artist);
	}
	
	public void delete (int id) {
		artistRepository.delete(id);
	}
}
