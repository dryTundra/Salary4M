/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salary4m;
import penggajian.*;
import java.util.ArrayList;
import dataset.datasetKaryawan;

/**
 *
 * @author Asus
 */
public class Salary4M {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String [] nama1 = {"A","B"};
        String nama2 [] = {"C","D"};
        String nama3 [] = new String[3];
        nama3[0] = "A";
        nama3[1] = "B";
        nama3[2] = "C";
        
        int tahun [] = new int[5];
        tahun[0] = 2012;
        tahun[1] = 2013;

        System.out.println(nama3.length);
        System.out.println(tahun[0]);
        
        ArrayList <Integer> umur = new ArrayList<Integer>();
        umur.add(30);
        umur.add(40);
        
        System.out.println(String.valueOf(umur.size()));
        System.out.println(umur.get(1));
        
        ArrayList<String> kota = new ArrayList<String>();
        kota.add("Banjarmasin");
        kota.add("Banjarbaru");
        
        System.out.println(kota);
        
         //gaji myobj = new gaji("Menikah", "Golongan 2", 9, 10);
          
        //gaji myobj = new gaji();
        //myobj.setGolongan("");
        //myobj.setMasaKerja(1);
        //myobj.setStatus("Menikah");
        //myobj.setTunjAnak(2);
        
        //System.out.println("Gaji Total "+ myobj.GajiTotal());
    }
    
}
