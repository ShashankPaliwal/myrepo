package com.liberary.AddMusicLiberaryApplication.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liberary.AddMusicLiberaryApplication.model.Album;
import com.liberary.AddMusicLiberaryApplication.service.AlbumService;

@RestController
public class AlbumRestController {

	@Autowired
	private AlbumService albumService;
	
	@RequestMapping("/api/albums")
	public String getAllAlbum() {
		return albumService.findAll().toString();
	}
	
	@PostMapping("/api/album")
	public String saveAlbum(@RequestBody Album album , HttpRequest request) {
		albumService.save(album);
		return "Data saved";
	}
	
	@DeleteMapping("/api/album/{albumId}")
	public String deleteAlbum(@PathParam("albumId") Integer albumId){
		albumService.delete(albumId);
		return "album deleted sucessfully";
	}
}
