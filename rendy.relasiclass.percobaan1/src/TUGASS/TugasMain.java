/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASS;

/**
 *
 * @author rendy
 */
import java.util.Scanner;
public class TugasMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Buku bk = new Buku("Laskar Pelangi",1987);
        Mahasiswa mh = new Mahasiswa();
        System.out.print("Masukkan Nim : ");
        int nim = sc.nextInt();
        mh.setNim(nim);
        System.out.print("Masukkan Nama : ");
        String nama = sc.next();
        mh.setNama(nama);
        System.out.print("Masukkan Kelas : ");
        String kelas = sc.next();
        mh.setKelas(kelas);
        System.out.println("=====================");
        Peminjaman pj = new Peminjaman(bk,mh);
        pj.print();
        System.out.println("");
        System.out.println("=============================");
        System.out.print("Transaksi Kembali ??(0(tidak)/1(ya))");
        int kem = sc.nextInt();
        if (kem==1) {
            Kembali km = new Kembali(pj);
            km.cetakLaporan();
        }
        else{
            System.out.println("Jangan Lupa Dikembalikan Tepat Waktu");
        }
        
    }
}
