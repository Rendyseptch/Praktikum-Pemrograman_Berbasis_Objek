/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASS;

/**
 *
 * @author rendy
 */
public class Kembali {
    private Peminjaman pinjam;
    Kembali(Peminjaman pj){
        this.pinjam=pj;
    }
    public void cetakLaporan(){
        System.out.println("Transaksi Kembali");
        pinjam.print();
  }
}
