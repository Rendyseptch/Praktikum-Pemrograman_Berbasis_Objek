/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rendy.relasiclass.percobaan1;

/**
 *
 * @author rendy
 */
public class Laptop {
    
    private String merk;
    private Processor proc;
    
    //constructor default 
    public Laptop(){  
    }
    
     Laptop(String merk, Processor proc){
        this.merk= merk;
        this.proc= proc;
    }
      //setter
         public void setMerk(String merk){
             this.merk=merk;
         }
          public void setProc(Processor proc){
             this.proc=proc;
         }
         
          //getter
         public String getMerk(){
             return merk;
         }
         
         public Processor getProc(){
             return  proc;
         }
             
        public void info(){     
    System.out.println("Merk Laptop = " + merk);
proc.info();
        }
}



         

