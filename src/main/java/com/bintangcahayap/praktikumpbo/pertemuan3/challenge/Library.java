/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bintangcahayap.praktikumpbo.pertemuan3.challenge;

public class Library {
    private String nama;
    private int visitorsToday;
    private int yearBuilt;

    public Library(String nama, int visitorsToday, int yearBuilt ) 
    {
        this.nama = nama;
        this.visitorsToday = visitorsToday;
        this.yearBuilt = yearBuilt;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getVisitorsToday() {
        return visitorsToday;
    }

    public void setVisitorsToday(int visitorsToday) {
        this.visitorsToday = visitorsToday;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }
    
    public void showProfile (){
        System.out.println("Nama            : " + nama);
        System.out.println("Pengunjung      : " + visitorsToday);
        System.out.println("Tahun dibangun  : " + yearBuilt);
    }
    
}
