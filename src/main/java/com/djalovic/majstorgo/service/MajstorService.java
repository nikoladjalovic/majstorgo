package com.djalovic.majstorgo.service;

import com.djalovic.majstorgo.model.Majstor;
import com.djalovic.majstorgo.repository.MajstorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MajstorService {
    @Autowired
    private MajstorRepository majstorRepository;

    public List<Majstor> getAllMajstors() {
        return majstorRepository.findAll();
    }

    public void addMajstor(Majstor majstor) {
        majstorRepository.save(majstor);
    }

    public void updateMajstor(Majstor majstor, int id) {
        Optional<Majstor> existingMajstor = majstorRepository.findById(id);

        if(existingMajstor.isPresent()){
            Majstor majstorToUpdate = existingMajstor.get();
            majstorToUpdate.setTypeOfMajstor(majstor.getTypeOfMajstor());
            majstorToUpdate.setCommonHourlyRate(majstor.getCommonHourlyRate());
            majstorToUpdate.setFirstName(majstor.getFirstName());
            majstorToUpdate.setLastName(majstor.getLastName());
            majstorToUpdate.setAge(majstor.getAge());

            majstorRepository.save(majstorToUpdate);
        }else{
            System.out.println("Majstor with id " + id + "was not found and we could not update it");
        }
    }


    public void deleteMajstor(int id) {
        majstorRepository.deleteById(id);
    }
}
