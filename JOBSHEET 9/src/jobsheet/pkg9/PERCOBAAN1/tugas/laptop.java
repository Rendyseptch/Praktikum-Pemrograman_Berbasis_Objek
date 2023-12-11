/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet.pkg9.PERCOBAAN1.tugas;

/**
 *
 * @author rendy
 */
public class laptop  extends komputer {
   public String jnsBatrei;
   
   public laptop(){
       
   }
   public laptop(String merk, int kecProcessor,int sizeMemory, String jnsProcessor, String jnsBatrei ){
       super(merk,kecProcessor,sizeMemory,jnsProcessor);
        this.jnsBatrei=jnsBatrei;
   }
        public void tampilData(){
        super.tampilData();
        System.out.println("jenis baterai               ="  +jnsBatrei);
       
   }
}
