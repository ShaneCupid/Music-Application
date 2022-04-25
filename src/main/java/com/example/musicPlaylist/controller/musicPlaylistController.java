package com.example.musicPlaylist.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.musicPlaylist.model.musicPlaylist;
import com.example.musicPlaylist.service.musicService;

@RestController
@RequestMapping("/api")
public class musicPlaylistController {
        @Autowired
        musicService MscService;
        
        @RequestMapping(value="/playlist/track", method=RequestMethod.POST)
        public musicPlaylist createMusic(@RequestBody musicPlaylist Msc) {
            return MscService.createMusic(Msc);
        }

        @RequestMapping(value="/playlist/track", method=RequestMethod.GET)
        public List<musicPlaylist> getMusic() {
            return MscService.getMusic();
}

        @RequestMapping(value="/playlist/track/{Id}", method=RequestMethod.PUT)
        public musicPlaylist updateMusic(@PathVariable(value = "Id") Long Id, @RequestBody musicPlaylist MscDetails) {
            return MscService.updateMusic(Id, MscDetails);
        }

        @RequestMapping(value="/playlist/{Id}", method=RequestMethod.DELETE)
        public void deleteMusic(@PathVariable(value = "Id") Long Id) {
            MscService.deleteMusic(Id);
        }
        @RequestMapping(value="/playlist/track/{Id}/{newname}", method=RequestMethod.PATCH)
        public musicPlaylist fixMusic(@PathVariable(value = "Id") Long Id, @PathVariable(value = "newname") String newname) {
            return MscService.fixMusic(Id, newname);
        }}
