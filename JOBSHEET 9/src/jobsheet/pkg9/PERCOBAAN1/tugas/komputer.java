/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet.pkg9.PERCOBAAN1.tugas;

/**
 *
 * @author rendy
 */
public class komputer {
    public String merk ,jnsProcessor;
    public int kecProcessor, sizeMemory;
    
   public  komputer(){
        
    }
     public komputer(String merk, int kecProcessor,int sizeMemory, String jnsProcessor){
        this.merk=merk;
        this.kecProcessor=kecProcessor;
        this.sizeMemory=sizeMemory;
        this.jnsProcessor=jnsProcessor;
        
    }
     public void tampilData(){
        System.out.println("Merk                        ="  +merk);
        System.out.println("Kecepatan Processor         ="  +kecProcessor +"Ghz");
        System.out.println("size Memory                 ="  +sizeMemory+"GB");
        System.out.println("jenis Processor             ="  +jnsProcessor);
        
     }
    
}
