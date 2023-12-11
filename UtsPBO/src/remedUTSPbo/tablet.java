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
public class tablet extends Barang {
    public String memory;
    public String kamera;
    public String internal;
    public String pen;
    
    public tablet(){
        
    }
    public tablet(String namaBrg, int harga,int dp
      , String memory,String kamera, String internal, String pen){
        super(namaBrg, harga, dp);
        this.memory=memory;
        this.kamera=kamera;
        this.internal=internal;
        this.pen= pen;
    }
    public void Syarat(){
        System.out.println("KTP sebagai syarat sewa ");
    }
     public void Denda(){
       System.out.println("apabila Tejadi Keterlambatan Pengembalian");
    }
    public void tampilTablet(){
         System.out.println("======================================= ");
         super.tampilBarang();
         System.out.println("Memory           : "+memory);
         System.out.println("Kamera           : "+kamera);
         System.out.println("Storage          : "+internal);
         System.out.println("Pen              : "+pen);
         System.out.println("");
    }
   
}
