/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rendy.relasiclass.percobaan1.praktikum_2;

/**
 *
 * @author rendy
 */
public class pelanggan {
    private String nama;
    private Mobil mobil;
    private sopir sopir;
    private int hari;
    
   public void setNama(String nama){
        this.nama=nama;  
    }
    public String getNama(){
        return nama;
    }
    
    public void setMobil(Mobil mobil){
    this.mobil=mobil;  
    }
    
    public  Mobil getMobil(){
        return mobil;
    }
    
    public void setSopir(sopir sopir){
    this.sopir=sopir;  
    }
    
    public  sopir getSopir(){
        return  sopir;
    }
    public void setHari(int hari){
    this.hari=hari;  
    }
    
    public  int  getHari(){
        return  hari;
    }
    
    public int hitungBiayaTotal() {
    return mobil.hitungBiayaMobil(hari) +
     sopir.hitungBiayaSopir (hari);
}
}
