/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbo;

/**
 *
 * @author rendy
 */
public class komputer extends peralatanKomputer{
    public String ram;
    public String monitor;
    public String processor;
    public komputer(){
        
    }
   public komputer(String namaBrg, int thnKeluaran, String warna,
    String tipe, int dp, int hargaSewa, String ram, String monitor, String processor){
        super(namaBrg,thnKeluaran,warna,tipe,dp,hargaSewa );
        this.ram=ram;
        this.monitor=monitor;
        this.processor=processor;
    }
    public void tampil(){
         System.out.println("==============SEWA KOMPUTER=============== ");
         super.tampil();
         System.out.println("ram              : "+ram);
         System.out.println("Monitor          : "+monitor);
         System.out.println("Processor        : "+processor);
    }
    public void dp(){
        System.out.println("silahkan anda bayarkan dp anda");
    }
    
    
}
