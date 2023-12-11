/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rendy.relasiclass.percobaan1;

/**
 *
 * @author rendy
 */
public class Processor {
         private String merk;
         private double cache;
         
         //constructor default 
         public Processor(){
            
         }
         
         Processor(String merk, double cache){
            this.merk= merk;
            this.cache=cache;
        }   
         
         //setter
         public void setMerk(String merk){
             this.merk=merk;
         }
          public void setCache(Double cache){
             this.cache=cache;
         }
         
          //getter
         public String getMerk(){
             return merk;
         }
         
         public Double getCache(){
             return cache;
         }
         
          public void info() {
      System.out.printf("Merk Processor = %s\n", merk);
      System.out.printf("Cache Memory = %.2f\n", cache);
      }
}
        
