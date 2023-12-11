/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan2.tugas.tugas1;

/**
 *
 * @author rendy
 */
import java.util.Scanner;
public class testPeminjaman {
    public static void main (String[]args){
        peminjaman pj1 = new peminjaman();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("+++++++++MENGINPUTKAN DATA+++++++++");
        System.out.print("Masukkan ID        : ");
        pj1.id = sc.nextInt();
        System.out.print("Masukkan Nama Member    : ");
        pj1.namaMember = sc.next();
        System.out.print("masukkan Nama Game  : ");
        pj1.namaGame = sc.next();
        System.out.print("Masukkan Harga      : ");
        pj1.harga = sc.nextDouble();
        System.out.print("Lama Sewa    : ");
        pj1.lamaSewa = sc.nextInt();
        System.out.println();   
        System.out.println("+++++++++TAMPIL DATA++++++++");
        pj1.tampil();

    }
}
