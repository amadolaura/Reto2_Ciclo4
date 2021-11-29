/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.edu.reto_dos.repository;

import com.misiontic.edu.reto_dos.Interface.InterfaceFragance;
import com.misiontic.edu.reto_dos.model.Fragance;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Laurita
 */
@Repository
public class FraganceRepository {
    
    @Autowired
    private InterfaceFragance repository;

    public List<Fragance> getAll() {
        return repository.findAll();
    }
    
    public Optional<Fragance> getClothe(String reference) {
        return repository.findById(reference);
    }
    
    public Fragance create(Fragance fragance) {
        return repository.save(fragance);
    }

    public void update(Fragance fragance) {
        repository.save(fragance);
    }
    
    public void delete(Fragance fragance) {
        repository.delete(fragance);
    }
}

