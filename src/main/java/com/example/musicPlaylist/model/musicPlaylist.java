package com.example.musicPlaylist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name = "playlist")
	public class musicPlaylist {
	        
	        @Id
	        @GeneratedValue(strategy = GenerationType.AUTO)
	        @Column(name="Id")
	            private Long id;
	        
			@Column(name="Name")
	        private String name;
	        
	        @Column(name="Genre")
	        private String genre;
	        
	        @Column(name="Artist")
	        private String artist;
	        
	        @Column(name="Duration_in_seconds")
	        private int durationInSeconds;

			@Override
			public String toString() {
				return "musicPlaylist [id=" + id + ", Name=" + name + ", Genre=" + genre + ", Artist=" + artist
						+ ", DurationInSeconds=" + durationInSeconds + "]";
			}

			public Long getId() {
				return id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getGenre() {
				return genre;
			}

			public void setGenre(String genre) {
				this.genre = genre;
			}

			public String getArtist() {
				return artist;
			}

			public void setArtist(String artist) {
				this.artist = artist;
			}

			public int getDurationInSeconds() {
				return durationInSeconds;
			}

			public void setDurationInSeconds(int durationInSeconds) {
				this.durationInSeconds = durationInSeconds;
			}

			public musicPlaylist(Long id, String name, String genre, String artist, int durationInSeconds) {
				super();
				this.id = id;
				this.name = name;
				this.genre = genre;
				this.artist = artist;
				this.durationInSeconds = durationInSeconds;
			}

			public musicPlaylist() {
				super();
			}

			
			}

			
			
	        
	

	
	
	
	
	