/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuispbo;

/**
 *
 * @author rendy
 */
public class hp21 {
     private int Imei;
     private String Merk;
     
     private String jenisKerusakan;
      
     public hp21(){
         
     }
     
     public void setIMEI(int Imei){
         this.Imei=Imei;
     }
     public void setMerk( String merk){
         this.Merk=merk;
     }
     public void setJenisKerusakan(String  Kerusakan){
         this.jenisKerusakan=Kerusakan;   
     }
     public int getIMEI(){
         return Imei;
     }
      public String getMerk(){
         return Merk;
     }
       public String  getJenisKerusakan(){
         return jenisKerusakan;
     }
        public void info(){
         String info = "";
    System.out.println("Imei                 : " + this.Imei  );
    System.out.println("Merk                 : " + this.Merk );
    System.out.println("Jenis kerusakan      : " + this.jenisKerusakan );

     } 
}
