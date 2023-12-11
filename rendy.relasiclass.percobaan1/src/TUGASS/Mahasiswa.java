/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASS;

/**
 *
 * @author rendy
 */
public class Mahasiswa {
    private int nim;
    private String nama;
    private String kelas;
    Mahasiswa(){
        
    }
    public void setNim(int nm){
        nim = nm;
    }
    public int getNim(){
        return nim;
    }
    public void setNama(String nma){
        nama = nma;
    }
    public String getNama(){
        return nama;
    }
    public void setKelas(String kls){
        kelas = kls;
    }
    public String getKelas(){
        return kelas;
    }
    public void print(){
        System.out.println("Nim : "+nim);
        System.out.println("Nama : "+nama);
        System.out.println("Kelas : "+kelas);
    }
    
}
