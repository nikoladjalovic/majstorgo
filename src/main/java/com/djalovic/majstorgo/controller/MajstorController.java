package com.djalovic.majstorgo.controller;

import com.djalovic.majstorgo.service.MajstorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MajstorController {
    @Autowired
    private MajstorService majstorService;
}
