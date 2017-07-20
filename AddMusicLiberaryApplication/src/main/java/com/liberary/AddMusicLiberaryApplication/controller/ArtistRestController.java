package com.liberary.AddMusicLiberaryApplication.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.liberary.AddMusicLiberaryApplication.model.Artist;
import com.liberary.AddMusicLiberaryApplication.service.ArtistService;

@RestController
public class ArtistRestController {

	@Autowired
	private ArtistService artistService;

	@GetMapping("/api")
	public String hello() {
		return "Hello From AppRestController ";
	}

	@GetMapping("/api/artists")
	public String getAllArtists() {
		// return "I am in Artists";
		return artistService.findAll().toString();
	}

	@PostMapping("/api/atrist")
	public String saveArtist(@RequestBody String name) {
		Artist artist = new Artist(name);
		artistService.save(artist);
		return "Saved Artist";
	}
	
	@DeleteMapping("/api/atrist/{artistId}")
	public String deleteArtist(@PathParam("artistIdId") Integer artistId) {
		artistService.delete(artistId);
		return "Deleted Artist";
	}	
}
