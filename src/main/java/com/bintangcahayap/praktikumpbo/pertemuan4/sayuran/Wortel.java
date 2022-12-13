package com.bintangcahayap.praktikumpbo.pertemuan4.sayuran;

public class Wortel extends Sayur  {
    String vitamin;
    String khasiat;
    String mengandung;
    
    public void digunakan(String gunakan){
        System.out.println("Wortel" + nama + "digunakan" + gunakan + "!");
    }
    
    public void digunakan(){
        System.out.println("Error           : Mohon masukkan digunakan!");
    }
    
    public void extraInfo(){
        System.out.println("Vitamin         : " + vitamin);
        System.out.println("Khasiat         : " + khasiat);
        System.out.println("Mengandung      : " + mengandung);
    }
}