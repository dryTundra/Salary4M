/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penggajian;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class gaji {
    private int tunjGajiPokok;
    private int tunjStatus;
    private int tunjMasaKerja;
    private int tunjAnak;
    
    public gaji(){} // constructor 1
    
    public gaji(String sts, String gol, int jumAnak, int masaKerja){
        setGolongan(gol);
        setStatus(sts);
        setTunjAnak(jumAnak);
        setMasaKerja(masaKerja);
    } // constructor 2
    
    public void setGolongan(String golongan){
        if (golongan.equals(null)){
            JOptionPane.showMessageDialog(null, "Golongan Belum Diisi");
        }else if (golongan.equals("Golongan 1")){
            this.tunjGajiPokok=3000000;
        }else if (golongan.equals("Golongan 2")){
            this.tunjGajiPokok=4000000;
        }else{
            this.tunjGajiPokok=5000000;
        }
    }
    
    public int getGolongan(){
        return this.tunjGajiPokok;
    }
    
    public void setStatus(String status){
        if (status.equals(null)){
            JOptionPane.showMessageDialog(null, "Status Belum Diisi");
        }else if (status.equals("Menikah")){
            this.tunjStatus=1000000;
        }else{
            this.tunjStatus=0;
        }
    }
    
    public int getStatus(){
        return this.tunjStatus;
    }
    
    public void setTunjAnak(int jumlah){
        if (jumlah>=0 && jumlah<=3){
            this.tunjAnak=750000;
        }else if (jumlah>=4 && jumlah<=7){
            this.tunjAnak=1000000;
        }else{
            this.tunjAnak=1500000;
        }
    }
    
    public int getTunjAnak(){
        return this.tunjAnak;
    }
    
    public void setMasaKerja(int masa){
        if (masa>=0 && masa<=3){
            this.tunjMasaKerja=500000;
        }else if (masa>=4 && masa<=7){
            this.tunjMasaKerja=1000000;
        }else{
            this.tunjMasaKerja=1500000;
        }
    }
    
    public int getTunjMasaKerja(){
        return this.tunjMasaKerja;
    }
    
    public int GajiTotal(){
        return getGolongan()+getStatus()+getTunjMasaKerja()+getTunjAnak();
    }
}
