/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan2;

/**
 *
 * @author rendy
 */
public class TestMahasiswa {
    public static void main(String args[]){
        Mahasiswa mhs1= new Mahasiswa();
        Mahasiswa mhs2= new Mahasiswa ();
        Mahasiswa mhs3= new Mahasiswa ();
        
        mhs1.nim=101;
        mhs1.nama="Lestari";
        mhs1.alamat="Jl. Vinolia No 1A";
        mhs1.kelas="1A";
        mhs1.tampilBiodata();
    }
}
