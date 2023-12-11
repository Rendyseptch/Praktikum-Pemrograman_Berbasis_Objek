/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan2.tugas3;

/**
 *
 * @author rendy
 */
import java.util.Scanner;
public class lingkaran {
    public double phi = 3.14; 
    public double r; 
    public double hitungLuas(){ 
    return phi*r*r; 
 } 
    public double hitungKeliling(){ 
    return 2*phi*r; 
 } 
    public void tampilData(){ 
       System.out.println("Luas       : "+hitungLuas()); 
       System.out.println("Keliling   : "+hitungKeliling()); 
 }
}
 