/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rendy.relasiclass.percobaan1.praktikum_2;

/**
 *
 * @author rendy
 */
public class sopir {
    private String nama;
    private int biaya;
    
    //setter
         public void setNama(String nama){
             this.nama=nama;
         }
          public void setBiaya(int biaya){
             this.biaya=biaya;
         }
         
          //getter
         public String getNama(){
             return nama;
         }
         
         public int getBiaya(){
             return biaya;
         }
     public int hitungBiayaSopir(int hari) {
return biaya * hari;    
}

}
