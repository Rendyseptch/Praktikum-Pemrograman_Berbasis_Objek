/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rendy.relasiclass.percobaan1.praktikum_2;

/**
 *
 * @author rendy
 */
public class Mobil {
    private String nama;
    private int biaya;
    
    public Mobil(){
        
    }
    
    public void setNama(String nama){
        this.nama=nama;  
    }
    public String getNama(){
        return nama;
    }
    
    public void setBiaya(int  biaya){
    this.biaya=biaya;  
    }
    
    public int getbiaya(){
        return biaya;
    }
    
    public int hitungBiayaMobil(int hari) {
    return biaya * hari;
}

}
