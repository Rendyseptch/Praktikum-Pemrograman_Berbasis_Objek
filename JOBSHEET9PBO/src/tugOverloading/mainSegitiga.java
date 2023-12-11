/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugOverloading;

/**
 *
 * @author rendy
 */
public class mainSegitiga {
        public static void main (String []args){
           Segitiga sgt = new Segitiga();
 System.out.println("Total Sudut Segitiga 1 " + sgt.totalSudut(90));
 System.out.println("Total Sudut Segitiga 2 " + sgt.sudut(30, 30));
 System.out.println("Keliling Segitiga 1 " + sgt.keliling(12, 12, 12));
 System.out.println("Keliling Segitiga 2 " + sgt.keliling(60, 80)); 
        }
        
}
