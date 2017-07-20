package com.liberary.AddMusicLiberaryApplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.Reference;

@Entity(name = "album")
public class Album {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="album_id")
	private int albumId;
	
	@Column(name="album_name")
	private String albumName;
	
	@Column(name="artist_id")
	private int artistId;
	
	@Column(name="tag_id")
	private int tagId;
	
	public Album() {}
	
	public Album(String albumName, int artistId, int tagId) {
		super();
		this.albumName = albumName;
		this.artistId = artistId;
		this.tagId = tagId;
	}
	
	public int getAlbumId() {
		return albumId;
	}
	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public int getArtistId() {
		return artistId;
	}
	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}
	public int getTagId() {
		return tagId;
	}
	public void setTagId(int tagId) {
		this.tagId = tagId;
	}

	@Override
	public String toString() {
		return "Album [albumId=" + albumId + ", albumName=" + albumName + ", artistId=" + artistId + ", tagId=" + tagId
				+ "]";
	}

	
}
