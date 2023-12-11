/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rendy.relasiclass.percobaan1.praktikum_2;

/**
 *
 * @author rendy
 */
public class mainPercobaan2 {
    public static void main( String []args){
            
       
Mobil m = new Mobil();
m.setNama("Avanza");
m.setBiaya(350000);
sopir s = new sopir();
s.setNama("John Doe");
s.setBiaya(200000);
pelanggan p = new pelanggan();
p.setNama("Jane Doe");
p.setMobil(m);
p.setSopir(s);
p.setHari(2);
System.out.println("Biaya Total = " +  p.hitungBiayaTotal());
//modifikasi    
System.out.println(p.getMobil().getNama());
    }
}
