/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASS;

/**
 *
 * @author rendy
 */
public class Buku {
    private String judul;
    private int tahun;
    Buku(){
        
    }
    Buku(String judul,int tahun){
        this.judul= judul;
        this.tahun = tahun;
    }
    public void setJudul(String jdl){
        judul=jdl;
    }
    public String getJudul(){
        return judul;
    }
    public void setTahun(int thn){
        tahun=thn;
    }
    public int getTahun(){
        return tahun;
    }
    public void print(){
        System.out.println("Judul : "+judul);
        System.out.println("Tahun : "+tahun);
    }
}
