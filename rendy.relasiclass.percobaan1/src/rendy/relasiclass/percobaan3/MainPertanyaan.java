/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rendy.relasiclass.percobaan3;

/**
 *
 * @author rendy
 */
public class MainPertanyaan {
    public static void main (String[] args){
            
    pegawai masinis = new pegawai("1234", "Spongebob Squarepants");
    Keretaapi keretaapi = new Keretaapi("Gaya Baru", "Bisnis", masinis);

System.out.println(keretaapi.info());

    }   
}
