/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remedUTSPbo;

/**
 *
 * @author rendy
 */
public class Pelanggan {
    public int id_pelanggan;
    public String nama;
    public String notelp;
    public String alamat;
    
    public Pelanggan(){
        
    }
 
    public Pelanggan( int id, String nama,  String notelp, String alamat){
        this.id_pelanggan= id;
        this.nama= nama;
        this.notelp= notelp;
        this.alamat= alamat;
    }

    public void tampilPelanggan(){
        
        System.out.println("Id cust          : "+id_pelanggan);
        System.out.println("Nama Cust        : "+nama);
        System.out.println("No Telp          : "+notelp);
        System.out.println("Alamat           : "+alamat);
    
        
    }
}
