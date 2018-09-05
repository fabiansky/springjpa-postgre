/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fabien.tutorial.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author fabie
 */
@Entity
@Table(name="EMPLOYE")
public class Employe implements Serializable {
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   private Long id;
   private String nom;
   private String prenoms;
   private int age;

    public Employe() {
    }

    public Employe(String nom, String prenoms, int age) {
        this.nom = nom;
        this.prenoms = prenoms;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employe{" + "id=" + id + ", nom=" + nom + ", prenoms=" + prenoms + ", age=" + age + '}';
    }
   
   
    
}
