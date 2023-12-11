/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbo;

/**
 *
 * @author rendy
 */
public class tablet extends peralatanKomputer {
    public String memory;
    public String kamera;
    public String internal;
    
    public tablet(){
        
    }
    public tablet(String namaBrg, int thnKeluaran, String warna,
    String tipe, int dp, int hargaSewa, String memory,String kamera, String internal){
        super(namaBrg,thnKeluaran,warna,tipe,dp,hargaSewa );
        this.memory=memory;
        this.kamera=kamera;
        this.internal=internal;
    }
    public void tampil(){
         System.out.println("==============SEWA Tablet=============== ");
         super.tampil();
         System.out.println("ram             : "+memory);
         System.out.println("Monitor         : "+kamera);
         System.out.println("Processor       : "+internal);
    }
    public void dp(){
        System.out.println("silahkan anda bayarkan dp anda");
    }
}
