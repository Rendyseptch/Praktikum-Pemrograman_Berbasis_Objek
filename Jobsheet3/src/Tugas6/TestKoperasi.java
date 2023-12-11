/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;


/**
 *
 * @author rendy
 */
import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args) 
	{
            Scanner sc = new Scanner(System.in);
            
                System.out.println("Masukkan no Ktp: ");
		String noKtp = sc.next();
            
		System.out.println("Masukkan nama: ");
		String nama = sc.next();
                
                System.out.println("Masukkan jumlah pinjaman: ");
		int  pinjaman = sc.nextInt ();
                
                System.out.println("Masukkan Angsuran: ");
		int  Angsuran = sc.nextInt ();
                
                
                Anggota anggota1 = new Anggota (noKtp, nama, 5000000);
                
		System.out.println("Nama Anggota: " + anggota1.getNama());
		System.out.println("Limit Pinjaman: " + anggota1.getLimitPinjaman());
		anggota1.pinjam(pinjaman);
		System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());
		
		anggota1.angsur(Angsuran );
		System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());
	
	}

}
