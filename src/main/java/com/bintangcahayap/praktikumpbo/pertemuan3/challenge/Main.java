/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bintangcahayap.praktikumpbo.pertemuan3.challenge;

public class Main {
    public static void main(String[] args) {
        Library umum = new Library ("Dinas Arsip dan Perpustakaan Daerah Banyumas", 150 , 2000);
        Library nasional = new Library ("Perpustakaan ITTP", 500 ,1989 );
        Library sekolah = new Library ("Perpustakaan ITTP", 250, 2002);
        
        umum.showProfile();
        nasional.showProfile();
        sekolah.showProfile();
    }
}
