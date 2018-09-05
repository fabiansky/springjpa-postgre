/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fabien.tutorial.repositories;

import com.fabien.tutorial.entities.Employe;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fabieen
 */
@Repository
public interface EmployeRepository extends CrudRepository<Employe, Long>{
    
    List findByPrenoms(String prenoms);
    @Query("SELECT e FROM Employe e WHERE e.age = :age")
    public List findByAge(@Param("age")int age);
    
}
