package com.bintangcahayap.praktikumpbo.pertemuan4.sayuran;

public class Main {
    public static void main(String[] args) {
        Wortel wr = new Wortel();
        Tomat tm = new Tomat();
        Kangkung kk = new Kangkung();
        
        
        //Wortel
        wr.nama = "Wortel";
        wr.warna = "Orange";
        wr.jumlah = 4;
        wr.vitamin = "A";
        wr.khasiat = "Menyehatkan mata";
        wr.mengandung = "beta-karoten";
        
        //Tomat
        tm.nama = "Tomat";
        tm.warna = "Merah";
        tm.jumlah = 2;
        tm.vitamin = "A dan C";
        tm.khasiat = "kesehatan tulang";
        tm.mengandung = "antioksidan";
        
        //Kangkung
        kk.nama = "Kangkung";
        kk.warna = "Hijau";
        kk.jumlah = 1;
        kk.vitamin = "A dan C";
        kk.khasiat = "mencegah diabetes";
        kk.mengandung = "antioksidan";
        
        wr.showInfo();
        wr.digunakan("Jus");
        wr.digunakan();
        wr.extraInfo();
        
        tm.showInfo();
        tm.extraInfo();
        
        kk.showInfo();
        kk.extraInfo();
    }
}