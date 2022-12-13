
package com.bintangcahayap.praktikumpbo.pertemuan4.kendaraan;

public class Kendaraan {
    
    //Attribute (Variable)
    String nama;
    int jmlRoda;

    //Method
    public void nyalakanMesin(){
        System.out.println("Mesin       : " + nama  + "Telah dinyalakan!");
    }
    
    public void showInfo(){
        System.out.println("Nama        : " + nama);
        System.out.println("Jml Roda    : " + jmlRoda);
        extraInfo();
    }
    
    public void extraInfo() {}
    
}
