/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet.pkg9.PERCOBAAN1.tugas;

/**
 *
 * @author rendy
 */
public class mac extends laptop{
   public String Security;
   
   public mac(){
       
   }
   public mac(String merk, int kecProcessor,int sizeMemory, String jnsProcessor, String jnsBatrei, String Security){
       super(merk,kecProcessor,sizeMemory,jnsProcessor,jnsBatrei);
       this.Security=Security;
   }
    public void tampilmac(){
        System.out.println("================== Mac ==========================");
        super.tampilData();
        System.out.println("Security                      ="  +Security);
    }
}
