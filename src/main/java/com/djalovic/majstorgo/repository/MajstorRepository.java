package com.djalovic.majstorgo.repository;

import com.djalovic.majstorgo.model.Majstor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MajstorRepository extends JpaRepository<Majstor,Integer> {

}
