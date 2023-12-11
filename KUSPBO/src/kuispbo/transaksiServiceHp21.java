/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuispbo;

/**
 *
 * @author rendy
 */
import java.util.Date;
public class transaksiServiceHp21 {
    private String idTransaksi;
    private Date rendy= new Date();
    private int totalPembayaran;
    private pelanggan21 pelanggan;
    private pegawai21 pegawai;
    private int total;
    
    
   public transaksiServiceHp21(){
        
    }
   public transaksiServiceHp21(String id,Date tgl){
       this.idTransaksi=id;
       this.rendy = tgl;
   }
   public void setPegawai(pegawai21 pegawai){
       this.pegawai=pegawai;
   }
   public void setPelanggan(pelanggan21 pelanggan){
       this.pelanggan=pelanggan;
   }
   public void setTotalPembayaran(int total){
       this.total=total;
   }
   public pegawai21 pegawai(){
       return pegawai;
   }
    public pelanggan21 pelanggan(){
       return pelanggan;
   }
    public int  totalPembayaran(){
       return total;
   }
    public void StrukPembayaran(){
   
   System.out.println("Id transaksi         : " + this.idTransaksi );
   System.out.println("Tanggal Transaksi    : " + this.rendy);
   System.out.println("Total Pembayaran     : "+"Rp." + this.total );
    }  
  }
   
