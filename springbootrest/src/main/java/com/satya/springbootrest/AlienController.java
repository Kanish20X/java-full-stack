package com.satya.springbootrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class AlienController {

    @Autowired  // basically it is used to deal with all implementations of AlienDb creation of obj as well
    AlienDb obj ;

    @GetMapping("aliens")
    public List<Alien> getAlien() {

        List <Alien> aliens = (List<Alien>) obj.findAll();


        return aliens;
    }

}
