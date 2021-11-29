package com.misiontic.edu.reto_dos;

import com.misiontic.edu.reto_dos.Interface.InterfaceFragance;
import com.misiontic.edu.reto_dos.Interface.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class RetoDosApplication implements CommandLineRunner {
    
    @Autowired
    private InterfaceFragance interfaceFragance;
    @Autowired
    private InterfaceUser interfaceUser;
	public static void main(String[] args) {
		SpringApplication.run(RetoDosApplication.class, args);
	}
    @Override
    public void run(String... args) throws Exception {
        interfaceFragance.deleteAll();
        interfaceUser.deleteAll();
    }

}

        

