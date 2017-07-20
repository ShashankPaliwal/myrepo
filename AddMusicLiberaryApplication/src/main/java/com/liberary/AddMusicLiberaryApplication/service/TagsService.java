package com.liberary.AddMusicLiberaryApplication.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.liberary.AddMusicLiberaryApplication.dao.TagsRepository;

import com.liberary.AddMusicLiberaryApplication.model.Tags;

@Service
@Transactional
public class TagsService {

	private final TagsRepository tagsRepository;

	public TagsService(TagsRepository tagsRepository) {
		super();
		this.tagsRepository = tagsRepository;
	}

	public List<Tags> findAll() {
		List<Tags> tags = new ArrayList<>();
		for (Tags tag : tagsRepository.findAll()) {
			tags.add(tag);
		}
		return tags;
	}

	public void save(Tags tags) {
		tagsRepository.save(tags);
	}
	
	public void delete(int id) {
		tagsRepository.delete(id);
	}
}
