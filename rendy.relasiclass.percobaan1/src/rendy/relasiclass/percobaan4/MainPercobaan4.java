/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rendy.relasiclass.percobaan4;

/**
 *
 * @author rendy
 */
public class MainPercobaan4 {
    public static void main (String[] args){
        
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        
         Penumpang budi = new Penumpang("234u8", "Budi");
         gerbong.setPenumpang(budi, 1);
        
        System.out.println(gerbong.info());

    }
}
