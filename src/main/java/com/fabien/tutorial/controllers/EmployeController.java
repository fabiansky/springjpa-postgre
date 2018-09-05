/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fabien.tutorial.controllers;

import com.fabien.tutorial.entities.Employe;
import com.fabien.tutorial.repositories.EmployeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fabie
 */
 @RestController
@RequestMapping("/employe")
public class EmployeController {
    
    @Autowired
    EmployeRepository employeRepository;
    
    @RequestMapping(value="/save", method= RequestMethod.POST)
    HttpStatus insertEmployee(@RequestBody Employe employe){
        boolean status = employeRepository.save(employe) != null;   
        return status? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
    }
    @RequestMapping("/findAll")
    public List findAll(){
        return (List) employeRepository.findAll();
    }
    @RequestMapping("/findbyid")
    public Optional<Employe> findById(@RequestParam("id") Long id){
        return employeRepository.findById(id);
    }
    
    @RequestMapping("/findbyprenoms")
    public Employe findByPrenoms(@RequestParam("prenoms") String prenoms){
        return (Employe) employeRepository.findByPrenoms(prenoms);
    }
    
    @RequestMapping("/findbyage")
    public List findByAge(@RequestParam("age") int age){
        return employeRepository.findByAge(age);
    }
}
