package com.bintangcahayap.praktikumpbo.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiException {
    public static void main(String[] args) {
        //Membuat object scanner untuk memasukkan inputan user
        Scanner input = new Scanner(System.in);
        
        try{
            // User diminta memasukkan bilangan
            System.out.print("Masukkan bilangan: ");
            int bilangan = input.nextInt();
            
            System.out.print("Masukkan pembagi : ");
            int pembagi = input.nextInt();
            
            // Proses pembagian
            int hasil = bilangan / pembagi;
            System.out.println("Hasil pembagian (dibulatkan: " + hasil);
        }
        // Jika ditemukan eror, program akan lari kesini
        catch(ArithmeticException e){
            System.out.println("Tidak dapat memproses!");
        }
        catch(InputMismatchException e){
            System.out.println("Harap masukkan angka saja!");
        }
    }
}