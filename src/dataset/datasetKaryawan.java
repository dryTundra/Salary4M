/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class datasetKaryawan {
    
    private ArrayList<String> nip;
    private ArrayList<String> nama;
    private ArrayList<String> golongan;
    private ArrayList<String> status;
    private ArrayList<String> tunjAnak;
    private ArrayList<Integer> jumAnak;
    private ArrayList<Integer> masaKerja;
    
    public datasetKaryawan(){
    nip = new ArrayList<String>();
    nama = new ArrayList<String>();
    golongan = new ArrayList<String>();
    status = new ArrayList<String>();
    tunjAnak = new ArrayList<String>();
    jumAnak = new ArrayList<Integer>();
    masaKerja = new ArrayList<Integer>();
    }; //konstruktor
    
    public void insertNip(String isi){
        this.nip.add(isi);
    }
    
    public ArrayList<String> getRecordNip(){
        return this.nip;
    }
    
    // 
    
    public void insertNama(String isi){
        this.nama.add(isi);
    }
    
    public ArrayList<String> getRecordNama(){
        return this.nama;
    }
    
    //
    
    public void insertGolongan(String isi){
        this.golongan.add(isi);
    }
    
    public ArrayList<String> getRecordGolongan(){
        return this.golongan;
    }
    
    //
    
    public void insertStatus(String isi){
        this.status.add(isi);
    }
    
    public ArrayList<String> getRecordStatus(){
        return this.status;
    }
    
    //
    
    public void insertJumAnak(int isi){
        this.jumAnak.add(isi);
    }
    
    public ArrayList<Integer> getRecordJumAnak(){
        return this.jumAnak;
    }
    
    //
    
    public void insertMasaKerja(int isi){
        this.masaKerja.add(isi);
    }
    
    public ArrayList<Integer> getRecordMasaKerja(){
        return this.masaKerja;
    }
    
    
}