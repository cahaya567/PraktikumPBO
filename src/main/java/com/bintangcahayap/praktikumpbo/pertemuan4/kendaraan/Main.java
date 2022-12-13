package com.bintangcahayap.praktikumpbo.pertemuan4.kendaraan;

public class Main {
    public static void main(String[] args) {
        
        // Class object = new class
        Mobil mb = new Mobil();
        Kendaraan kn = new Kendaraan();
        Bus bs = new Bus();
        
        //Memasukkan nilai attribute
        mb.nama = "Mitsubishi";
        mb.jmlRoda = 4;
        mb.maxGear = 6;
        
        kn.nama = "Kendaraan misterius";
        kn.jmlRoda = 3;
        
        bs.nama = "Coyo";
        bs.jmlRoda = 6;
        bs.maxKapasitas = 1200;
        bs.kecepataan = 120;
        
        //Uji coba pemanggilan method
        mb.showInfo();
        mb.nyalakanMesin();
        mb.belok("kanan");
        mb.belok();
        
        kn.showInfo();
        kn.nyalakanMesin();
        
        bs.showInfo();
        bs.nyalakanMesin();
    }
}