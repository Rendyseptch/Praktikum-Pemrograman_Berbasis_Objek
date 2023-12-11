/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan2.tugas4;

/**
 *
 * @author rendy
 */
public class Barang {
    public String kode, namaBarang;
    public int hargaDasar;
    public float diskon;
    
    public int hitungHargaJual(){
    float hargaJual= hargaDasar -( diskon*hargaDasar);
    return (int) hargaJual;
}
    public void tampilData(){
        System.out.println("Kode barang        : "+ kode);
        System.out.println("nama barang        : "+ namaBarang);
        System.out.println("harga dasar        : "+ hargaDasar);
        System.out.println("Diskon             : "+ (int)(diskon*100) + "%");
        System.out.println("harga jual         : Rp. "+ hitungHargaJual());
    }
}
