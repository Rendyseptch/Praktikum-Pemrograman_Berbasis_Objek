/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet.pkg9.PERCOBAAN1.tugas;

/**
 *
 * @author rendy
 */
public class TugasMain {
   public static void main (String[]args){
        PC pc =new PC ("asus", 4200, 1000, "intel core I5", 24);
        pc.tampilPc();
    
    mac Mac= new mac("apple", 2500, 500, "chip apple M1", "Lithium ion", "secure Enclave");
        Mac.tampilmac();
        
    windows win= new windows("Asus", 3200, 512,"intel core i7", "ichel Cadmium", "Fingersprint");
    win. tampilWindows(); 
        
    }
} 
