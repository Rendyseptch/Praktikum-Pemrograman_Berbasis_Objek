/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remedUTSPbo;

import utspbo.*;

/**
 *
 * @author rendy
 */
public class miniKomputer extends Barang{
    public String jumProc;
    
     public miniKomputer(){
         
     }
     public miniKomputer( String namaBrg, int harga,int dp, String BanyakProc){
         super( namaBrg, harga, dp );
         this.jumProc=jumProc;
     }
     public void Syarat(){
        System.out.println("KTP sebagai syarat sewa");
    }
     public void Denda(){
       System.out.println("apabila Tejadi Keterlambatan Pengembalian");
    }
     public void tampilMiniKomputer(){
         System.out.println("======================================= ");
         super.tampilBarang();
         System.out.println("jumlah Processor  : "+ jumProc);
         
    }
}
