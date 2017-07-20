package com.liberary.AddMusicLiberaryApplication.dao;

import org.springframework.data.repository.CrudRepository;

import com.liberary.AddMusicLiberaryApplication.model.Album;

public interface AlbumRepository extends CrudRepository<Album, Integer>{

}
