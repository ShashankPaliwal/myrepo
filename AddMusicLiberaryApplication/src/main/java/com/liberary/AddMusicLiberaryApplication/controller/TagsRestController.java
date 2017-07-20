package com.liberary.AddMusicLiberaryApplication.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.nodes.Tag;

import com.liberary.AddMusicLiberaryApplication.model.Tags;
import com.liberary.AddMusicLiberaryApplication.service.TagsService;

@RestController
public class TagsRestController {
	
	@Autowired
	private TagsService tagsSerive;
	
	@RequestMapping("/api/tags")
	public String getAllTags() {
		return tagsSerive.findAll().toString();
	}

	@PostMapping("/api/tag")
	public String saveTags(@RequestBody String tagName) {
		Tags tag = new Tags(tagName);
		tagsSerive.save(tag);
		return "tags Saved";
		
	}
	
	@DeleteMapping("/api/tag/{tagId}")
	public String deleteTags(@PathParam("tagId") String tagId) {
		
		return "data deleted";
	}
}
