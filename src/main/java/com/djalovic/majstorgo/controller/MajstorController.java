package com.djalovic.majstorgo.controller;

import com.djalovic.majstorgo.model.Majstor;
import com.djalovic.majstorgo.service.MajstorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MajstorController {
    @Autowired
    private MajstorService majstorService;

    @GetMapping("/majstors")
    public List<Majstor> getMajstors(){
        return majstorService.getAllMajstors();
    }

    @PostMapping("/majstor")
    public void addMajstor(@RequestBody Majstor majstor){
        majstorService.addMajstor(majstor);
    }

    @PutMapping("/majstor/{id}")
    public void updateMajstor(@RequestBody Majstor majstor, @PathVariable("id") int id){
        majstorService.updateMajstor(majstor, id);
    }
}
