package com.bintangcahayap.UTS_NO2_B_3048;

public class SalariedEmployee extends Employee{
 
    public SalariedEmployee(){
        
    }
    
    public void TampilData(){
        System.out.println("Salaried Employee");
        Tampil();
        System.out.println("Total Gaji: " + GajiPokok);
    }
}
