/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remedUTSPbo;



/**
 *
 * @author rendy
 */
import java.time.LocalDate;
public class Rental {
    
    public int id_rental;
    public  kasir kasir;
    public  Pelanggan pelanggan;
    public Barang[] item;
    public int total;
    public LocalDate tanggal_sewa;
    public LocalDate tanggal_kembali;
    public int denda1=100000;
    public int denda2=150000;
    public int denda3=200000;
    public int hari;
    public int jumlah=0;
    
    
    public Rental(){
        
    }
    public Rental(int id,kasir kasir, Pelanggan pelanggan, Barang[] item,
       int total, LocalDate tgl_sewa, LocalDate tgl_kembali, int denda){
        this.id_rental=id;
        this.kasir=kasir;
        this.pelanggan=pelanggan;
        this.item= new Barang[total];
        this.total=total;
        this.tanggal_sewa=tgl_sewa;
        this.tanggal_kembali=tgl_kembali;
        this.denda1=denda1; 
        this.denda2=denda2;
        this.denda3=denda3;
       }
    Rental(int jumlah){
        this.item= new Barang[jumlah];
    }
   
    public void setTglKembali(int a){
       System.out.println("Dikembalikan pada "+tanggal_kembali ); 
    }
    public void denda1(){
       System.out.println("Denda keterlambatan Sebesar  : "+denda1);
    }
    public void denda2(){
       System.out.println("Denda keterlambatan Sebesar  : "+denda2);
    }
    public void denda3(){
       System.out.println("Denda keterlambatan Sebesar  : "+denda3);
    }
    public void addItem(Barang brg){
        this.item[jumlah]= brg;
        this.jumlah++;
    }
    
    public void info(){
        for(int i=0;i< item.length;i ++){
            System.out.println("");
            item[i].tampilBarang();
        }
    }
    
    public void tampilRental(){
        System.out.println("================STRUK PENYEWAAN===================== ");
        System.out.println("ID               : "+id_rental);
        System.out.println("Tanggal Sewa     : "+tanggal_sewa);
        System.out.println("Tanggal kembali  : "+tanggal_kembali);
       
        System.out.println(" ");
    }
    
}
