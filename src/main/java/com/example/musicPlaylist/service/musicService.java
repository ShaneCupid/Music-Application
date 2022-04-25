package com.example.musicPlaylist.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.musicPlaylist.model.musicPlaylist;
import com.example.musicPlaylist.repository.musicRepository;
import org.springframework.stereotype.Service;
@Service
public class musicService {

    @Autowired
        musicRepository MscRepository;        

//CREATE 
public musicPlaylist createMusic(musicPlaylist Msc) {
return MscRepository.save(Msc);
}

//READ
public List<musicPlaylist> getMusic() {
return MscRepository.findAll();
}

//DELETE
public void deleteMusic(Long Id) {
MscRepository.deleteById(Id);
}
//UPDATE
public musicPlaylist updateMusic(Long Id, musicPlaylist musicDetails) {
 musicPlaylist Msc = MscRepository.findById(Id).get();
 Msc.setName(musicDetails.getName());
 Msc.setGenre(musicDetails.getGenre());
 Msc.setArtist(musicDetails.getArtist());
 Msc.setDurationInSeconds(musicDetails.getDurationInSeconds());
 
 return MscRepository.save(Msc);                                
}

public musicPlaylist fixMusic(Long Id, String newname) {
	 musicPlaylist Msc = MscRepository.findById(Id).get();
	 Msc.setName(newname);
//	 Msc.setGenre(musicDetails.getGenre());
//	 Msc.setArtist(musicDetails.getArtist());
//	 Msc.setDurationInSeconds(musicDetails.getDurationInSeconds());
	 
	 return MscRepository.save(Msc);                                
	}
	
}
//public musicService() {
//	super();


