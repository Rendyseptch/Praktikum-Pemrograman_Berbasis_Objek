/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet.pkg9.PERCOBAAN1;

/**
 *
 * @author rendy
 */
public class Manager extends karyawan{
    public int tunjangan;
    
    public Manager(){
        
    }
    public void tampilDataManager(){
        super.tampilDataKaryawan();
        System.out.println("Tunjangan        ="  +tunjangan);
        System.out.println("Total Gaji       ="  +(super.gaji+tunjangan));
    } 
}
