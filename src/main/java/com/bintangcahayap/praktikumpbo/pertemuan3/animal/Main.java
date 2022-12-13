/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bintangcahayap.praktikumpbo.pertemuan3.animal;

public class Main {
    // 'main' + 'tab'
    public static void main(String[] args) {
        // Membuat object dari class Animal
        Animal cat = new Animal("Meong", 2, "Orange");
        Animal dog = new Animal("Heli", 5, "Black");
        Animal rabbit = new Animal("Mily", 1, "White");

        // Memanggil method
        cat.showProfile();
        
        System.out.println("");
       
        //Memanggil Method
        dog.showProfile();
        
        System.out.println("");
       
        // Mengisi Method
        rabbit.showProfile();
        
        // demo getter and setter
        System.out.println("Dog's name (before): " + dog.getName());
        dog.setName("Heli");
        System.out.println("Dog's name (after): " + dog.getName());
    }
}
