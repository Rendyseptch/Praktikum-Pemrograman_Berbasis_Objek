/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remedUTSPbo;



/**
 *
 * @author rendy
 */
public class Barang {
    public  String namaBarang;
    public  int dp;
    public  int harga;
    
    public Barang(){
        
    }
    public Barang(String namaBrg, int harga,int dp){
        this.namaBarang= namaBrg;
        this.harga= harga;
        this.dp= dp;
        
        
    }
    public void tampilBarang(){
        System.out.println("nama Barang       : "+namaBarang);
        System.out.println("Harga             : "+harga);
        System.out.println("DP                : "+dp);
        
       
    }
     public void Syarat(){
        System.out.println("KTP sebagai syarat sewa");
    }
    public void denda(){
        System.out.println("apabila Tejadi Keterlambatan Pengembalian");
    }
    
}
