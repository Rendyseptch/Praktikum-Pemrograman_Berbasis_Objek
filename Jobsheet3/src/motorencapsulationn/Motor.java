package motorencapsulationn;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rendy
 */
public class Motor {
    int kecepatan=100;
    private boolean  kontak0n= false;
public void nyalakanMesin(){
    kontak0n= true;
}
     public void matikanMensin(){
         kontak0n=false;
         kecepatan=0;
     }
         public void tambahKecepatan(){
             if(kontak0n==true){
                 if(kecepatan >= 100){
             System.out.println("Kecepatan anda mencapai batas maksimal silahkan kurangi kecepatan");
                 }
                 else
                 kecepatan+=5;
             }
             else{
                 System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
             }
         }
         public void kurangiKecepatan(){
             if(kontak0n==true){
                 kecepatan-=5;
             }
         }
     public void printStatus(){
         if (kontak0n==true){
             System.out.println("kontak On");
         }
         else{
             System.out.println("kontak OFF");
         }
         System.out.println("kecepatan "+ kecepatan+"\n");
     }
}
