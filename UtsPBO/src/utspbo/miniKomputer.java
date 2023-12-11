/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbo;

/**
 *
 * @author rendy
 */
public class miniKomputer extends peralatanKomputer{
    public String jumProc;
    
     public miniKomputer(){
         
     }
     public miniKomputer( String namaBrg, int thnKeluaran, String warna,
    String tipe, int dp, int hargaSewa, String BanyakProc){
         super( namaBrg,thnKeluaran,warna,tipe,dp,hargaSewa );
         this.jumProc=jumProc;
     }
     public void tampil(){
         System.out.println("==============SEWA Mini Komputer=============== ");
         super.tampil();
         System.out.println("jumlah Processor    : "+ jumProc);
         
    }
     public  void dp(){
          System.out.println("silahkan anda bayarkan dp anda");

     }
}
