/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author rendy
 */
public class TestKoperasi {
    public static void main(String[] args)
	{
		Anggota donny = new Anggota("111333444", "Donny", 5000000);
		
		System.out.println("Nama Anggota: " + donny.getNama());
		System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
		
		System.out.println("\nMeminjam uang 10.000.000...");
		donny.pinjam(10000000);
		System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
		
		System.out.println("\nMeminjam uang 4.000.000...");
		donny.pinjam(4000000);
		System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
		
		System.out.println("\nMembayar angsuran 1.000.000");
		donny.angsur(200000);
		System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
		
		System.out.println("\nMembayar angsuran 3.000.000");
		donny.angsur(3000000);
		System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
	}

}
