/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet9pbo.Overriding;

/**
 *
 * @author rendy
 */
public class overiddingMain {
    public static void main (String[]args){
        
        Manusia a= new Manusia();
        Manusia b= new Dosen();
        Manusia c= new Mahasiswa();
        
        a.bernafas();
        a.makan();
        b.makan();
        a.bernafas();
        c.makan();
    }
}
