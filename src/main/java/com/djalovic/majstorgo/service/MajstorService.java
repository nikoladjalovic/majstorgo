package com.djalovic.majstorgo.service;

import com.djalovic.majstorgo.repository.MajstorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MajstorService {
    @Autowired
    private MajstorRepository majstorRepository;
}
