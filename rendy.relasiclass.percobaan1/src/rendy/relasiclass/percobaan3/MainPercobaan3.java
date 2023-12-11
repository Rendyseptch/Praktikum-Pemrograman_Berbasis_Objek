/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rendy.relasiclass.percobaan3;

/**
 *
 * @author rendy
 */
public class MainPercobaan3 {
    public static void main (String []args){
    
        pegawai masinis = new pegawai("1234", "Spongebob Squarepants");
        pegawai asisten = new pegawai("4567", "Patrick Star");
        Keretaapi keretaApi = new Keretaapi("Gaya Baru", "Bisnis", masinis, asisten);

        System.out.println(keretaApi.info());

    }
}
