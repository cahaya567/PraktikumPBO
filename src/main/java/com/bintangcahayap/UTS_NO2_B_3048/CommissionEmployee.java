package com.bintangcahayap.UTS_NO2_B_3048;

public class CommissionEmployee extends Employee{
    public float Komisi;
    public float TotalPenjualan;
    public float Totalgaji;
    
    public CommissionEmployee(){
        
    }
    
    public float TotalGaji(){
        Totalgaji = GajiPokok + (Komisi * TotalPenjualan);
        return Totalgaji;
    }
    
    public void TampilData(){
        System.out.println("Commission Employee");
        Tampil();
        System.out.println("Total Gaji: " + Totalgaji);
    }
}
