package com.liberary.AddMusicLiberaryApplication.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tags")
public class Tags implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="tag_id")
	private int tagId;
	
	@Column(name="tag_name")
	private String tagName;

	public Tags() {}
	
	public Tags(String tagName) {
		super();
		this.tagName = tagName;
	}
	
	public int getTagId() {
		return tagId;
	}

	public void setTagId(int tagId) {
		this.tagId = tagId;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	@Override
	public String toString() {
		return "Tags [tagId=" + tagId + ", tagName=" + tagName + "]";
	}
	
}
