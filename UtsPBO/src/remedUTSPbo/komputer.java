/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remedUTSPbo;



/**
 *
 * @author rendy
 */
public class komputer extends Barang{
    public String Os;
    public String monitor;
    public String processor;
    public komputer(){
        
    }
   public komputer(String namaBrg, int harga,int dp
   , String Os, String monitor, String processor){
        super(namaBrg, harga, dp);
        this.Os=Os;
        this.monitor=monitor;
        this.processor=processor;
    }
   
    public void Syarat(){
        System.out.println("KTP sebagai syarat sewa");
    }
     public void Denda(){
        System.out.println("apabila Tejadi Keterlambatan Pengembalian");
    }
     
    public void tampilKomputer(){
         System.out.println("======================================= ");
         super.tampilBarang();
         System.out.println("Opertion System   : "+Os);
         System.out.println("Monitor           : "+monitor);
         System.out.println("Processor         : "+processor);
    }
}
