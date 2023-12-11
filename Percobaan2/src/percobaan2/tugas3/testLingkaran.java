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
public class testLingkaran {
    public static void main(String[] args) { 
       lingkaran ling = new lingkaran(); 
       Scanner sc= new Scanner(System.in); 
       System.out.print("Masukkan Jari-jari : "); 
      ling.r = sc.nextDouble(); 
      System.out.println(); 
      System.out.println("++++++++Lingkaran++++++++++"); 
 ling.tampilData(); 
 }
}
