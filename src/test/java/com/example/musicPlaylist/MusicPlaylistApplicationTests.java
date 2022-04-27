package com.example.musicPlaylist;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.musicPlaylist.model.musicPlaylist;
import com.example.musicPlaylist.repository.musicRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class MusicPlaylistApplicationTests {
	
    @Autowired
	musicRepository mRepo;
	
//create and save operation
	@Test
	@Order(1)
	public void testCreate () {
		musicPlaylist m = new musicPlaylist();
		m.setId(2L);
		m.setName("Something In The Way");
		m.setGenre("Alternative Rock");
		m.setArtist("Nirvana");
		m.setDurationInSeconds(230);
		mRepo.save(m);
		assertNotNull(mRepo.findById(2L).get());
	}
	//reading all records from database
	@Test
	@Order(2)
	public void testReadAll() {
		List<musicPlaylist> list = mRepo.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	//testing single records
	@Test
	@Order(3)
	public void testSingleSong() {
		musicPlaylist song = mRepo.findById(2L).get();
		assertEquals("Wind of Change", song.getName());
	}
	//updating 
	@Test
	@Order(4)
	public void testUpdate() {
		musicPlaylist m = mRepo.findById(3L).get();
		m.setDurationInSeconds(100);
		mRepo.save(m);
		assertNotEquals(222, mRepo.findById(3L).get().getDurationInSeconds());	
	}
	//deleting
	@Test
	@Order(5)
	public void testDelete() {
		mRepo.deleteById(2L);
		assertThat(mRepo.existsById(2L)).isFalse();
		//assertThat(mRepo.existsById(2L)).isTrue();

	}
}
