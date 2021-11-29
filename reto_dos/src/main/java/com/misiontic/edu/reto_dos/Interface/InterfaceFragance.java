/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.misiontic.edu.reto_dos.Interface;

import com.misiontic.edu.reto_dos.model.Fragance;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Laurita
 */
public interface InterfaceFragance extends MongoRepository<Fragance, String> {
    
}


