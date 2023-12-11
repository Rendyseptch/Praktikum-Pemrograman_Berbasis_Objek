/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbo;

/**
 *
 * @author rendy
 */
public class peralatanKomputer {
    public String namaBarang;
    public  int tahunKeluaran;
    public  String warna;
    public  String tipe;
    public  int dp;
    public  int hargaSewa;
    
    public peralatanKomputer(){
        
    }
    public peralatanKomputer(String namaBrg, int thnKeluaran, String warna,
    String tipe, int dp, int hargaSewa){
        this.namaBarang= namaBrg;
        this.tahunKeluaran= thnKeluaran;
        this.warna= warna;
        this.tipe= tipe;
        this.dp= dp;
        this.hargaSewa= hargaSewa;
        
    }
    public void tampil(){
        System.out.println("nama Barang      : "+namaBarang);
        System.out.println("tahun keluaran   : "+tahunKeluaran);
        System.out.println("warna            : "+warna);
        System.out.println("Tipe             : "+tipe);
        System.out.println("DP               : "+dp);
        System.out.println("Harga Sewa       : "+hargaSewa);
    }
    public void dp(){
        System.out.println("dp anda adalah      : "+dp);
    }
    
}
