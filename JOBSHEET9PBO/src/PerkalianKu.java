/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rendy
 */
public class PerkalianKu {
    void perkalian(int a, int b){
        System.out.println(a * b);
    }
    void perkalian(int a, int b, int c){
        System.out.println(a * b * c);
    }
    public static void main (String args[]){
       PerkalianKu objek= new PerkalianKu();
       objek.perkalian(25, 43);
       objek.perkalian(34, 23, 56);
    }
    
}
