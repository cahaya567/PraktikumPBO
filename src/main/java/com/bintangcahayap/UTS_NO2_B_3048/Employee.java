package com.bintangcahayap.UTS_NO2_B_3048;

public class Employee {
    protected String Nama;
    protected String NIP;
    protected float GajiPokok;
    
    public void Tampil(){
        System.out.println("Nama: " + Nama);
        System.out.println("NIP: " + NIP);
        System.out.println("Gaji Pokok: " + GajiPokok);
    }
}