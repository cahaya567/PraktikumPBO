package com.bintangcahayap.praktikumpbo.pertemuan6.tugas;

public class Exception1 {
    public static void main(String[] args) {
        try
        {
            int a = 1/0;
        }
        catch (Exception e)
        {
            System.out.println("ada kesalahan yang muncul");
        }
        finally
        {
            System.out.println("terima kasih telah menjalankan program");
        }
    }
}
