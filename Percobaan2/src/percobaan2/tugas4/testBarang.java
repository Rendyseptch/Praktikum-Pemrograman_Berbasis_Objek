/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan2.tugas4;

/**
 *
 * @author rendy
 */
public class testBarang {
        public static void main( String[]args){
            Barang brg1= new Barang ();
            System.out.println("Data Barang");
            brg1.kode= "Rendy212";
            brg1.namaBarang= "Buku Binder";
            brg1.hargaDasar= 2500;
            brg1.diskon= (float) 10/100;
            brg1.hitungHargaJual();
           
            brg1.tampilData();
        }
}
