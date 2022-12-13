/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bintangcahayap.praktikumpbo.pertemuan3.buku;

public class Main {
    public static void main(String[] args) {
        Novel satu = new Novel("Laskar Pelangi", 200, "Andrea Hirata", 2005, "Bintang Pustaka");
        
        Novel dua = new Novel("Tenggelamnya Kapal Van der Wijck", 250, "Hamka", 1938, "Syarkawi");
        
        satu.showProfile();
        dua.showProfile();
        
    }
}
