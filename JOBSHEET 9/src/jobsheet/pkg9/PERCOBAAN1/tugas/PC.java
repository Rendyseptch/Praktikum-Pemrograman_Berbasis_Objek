/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet.pkg9.PERCOBAAN1.tugas;

/**
 *
 * @author rendy
 */
public class PC extends komputer{
    public int ukuranMonitor;
    
    public PC(){
        
    }
    public PC(String merk, int kecProcessor,int sizeMemory, String jnsProcessor, int ukuranMonitor){
        super(merk,kecProcessor,sizeMemory,jnsProcessor);
        this.ukuranMonitor=ukuranMonitor;
    }
    public void tampilPc(){
        super.tampilData();
        System.out.println("Ukuran Monitor                      ="  +ukuranMonitor);
    }
}
