/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bintangcahayap.praktikumpbo.pertemuan3.buku;

public class Novel {
    private String nama;
    private int jumlahHalaman;
    private String namaPengarang;
    private int tahunTerbit;
    private String namaPenerbit;

    public Novel(String nama, int jumlahHalaman, String namaPengarang, int tahunTerbit, String namaPenerbit) {
        this.nama = nama;
        this.jumlahHalaman = jumlahHalaman;
        this.namaPengarang = namaPengarang;
        this.tahunTerbit = tahunTerbit;
        this.namaPenerbit = namaPenerbit;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public String getNamaPengarang() {
        return namaPengarang;
    }

    public void setNamaPengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getNamaPenerbit() {
        return namaPenerbit;
    }

    public void setNamaPenerbit(String namaPenerbit) {
        this.namaPenerbit = namaPenerbit;
    }
    
    public void showProfile (){
        System.out.println("Judul           : " + nama);
        System.out.println("Halaman         : " + jumlahHalaman);
        System.out.println("Pengarang       : " + namaPengarang);
        System.out.println("Tahun Terbit    : " + tahunTerbit);
        System.out.println("Nama Penerbit   : " + namaPenerbit);
    }
}
