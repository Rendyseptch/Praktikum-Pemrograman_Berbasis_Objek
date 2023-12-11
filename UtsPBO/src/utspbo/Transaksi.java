/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbo;

/**
 *
 * @author rendy
 */
public class Transaksi {
    
    public int id_transaksi;
    public int tanggal_transaksi;
    
    
    public Transaksi(){
        
    }
    public Transaksi(int id, int tanggal){
        this.id_transaksi=id;
        this.tanggal_transaksi=tanggal;
    }
    public void tampil(){
        System.out.println("ID Transaksi     : "+id_transaksi);
        System.out.println("tahun keluaran   : "+tanggal_transaksi);
    }
}
