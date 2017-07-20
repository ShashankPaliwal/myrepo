package com.liberary.AddMusicLiberaryApplication.dao;

import org.springframework.data.repository.CrudRepository;

import com.liberary.AddMusicLiberaryApplication.model.Artist;

public interface ArtistRepository extends CrudRepository<Artist, Integer> {

}
