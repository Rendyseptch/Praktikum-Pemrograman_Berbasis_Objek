/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koperasiGetterSetterr;

import KoperasiGetterSetter.*;

/**
 *
 * @author rendy
 */
public class Anggota {
    private String nama;
    private String alamat;
    private float simpanan;
    
    Anggota( String nama, String alamat){
            this.nama= nama;
            this.alamat =alamat;
            this.simpanan=0;
}
            
            
    //    setter, getter, nama, dan alamat
    public void setNama(String nama){
        this.nama=nama; 
    }
    public void setAlamat(String Alamat){
        this.alamat=alamat;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }

    //getter simpanan
    public float getSimpanan(){
        return simpanan;
    }
    public void setor(float uang){
        simpanan+= uang ;
    }
    public void pinjam(float uang){
        simpanan -=uang ;
    }
}