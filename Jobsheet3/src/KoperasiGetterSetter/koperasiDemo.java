/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KoperasiGetterSetter;

/**
 *
 * @author rendy
 */
public class koperasiDemo {
    public static void main (String[] args){
        Anggota anggota1= new Anggota();
        anggota1.setNama("iwan setiawan");
        anggota1.setAlamat("jalan sukarno hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan "+anggota1.getNama()+ " : Rp "+ anggota1.getSimpanan());
        
        anggota1.pinjam(5000);
        System.out.println("Simpanan "+anggota1.getNama()+ " : Rp "+ anggota1.getSimpanan());
    }
}
