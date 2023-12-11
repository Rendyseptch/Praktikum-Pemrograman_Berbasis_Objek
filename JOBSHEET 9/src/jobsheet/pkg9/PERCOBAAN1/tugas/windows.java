/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet.pkg9.PERCOBAAN1.tugas;

/**
 *
 * @author rendy
 */
public class windows extends laptop {
     public String fitur;
   
   public windows (){
       
   }
   public windows (String merk, int kecProcessor,int sizeMemory, String jnsProcessor, String jnsBatrei, String fitur){
       super(merk,kecProcessor,sizeMemory,jnsProcessor,jnsBatrei);
       this.fitur=fitur;
   }
    public void tampilWindows(){
        System.out.println("================ Windows ========================");
        super.tampilData();
        System.out.println("fitur                     ="  +fitur);
    }
}
