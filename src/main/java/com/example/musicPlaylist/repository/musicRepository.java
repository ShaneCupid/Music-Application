package com.example.musicPlaylist.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.musicPlaylist.model.musicPlaylist;
//import com.example.musicPlaylist.service.musicService;


@Repository
public interface musicRepository extends JpaRepository<musicPlaylist, Long> {

}
