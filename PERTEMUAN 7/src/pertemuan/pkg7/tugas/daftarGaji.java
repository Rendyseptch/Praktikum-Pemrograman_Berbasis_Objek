/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg7.tugas;

/**
 *
 * @author rendy
 */
public class daftarGaji  {
 private pegawai[] listPegawai;
 private int j = 0;
 
 daftarGaji(){
 
 }
 public daftarGaji(int jumlah_pegawai){
    listPegawai = new pegawai[jumlah_pegawai];
 }
 public void addPegawai(pegawai p){
    listPegawai[j] = p;
        j++;
 }
 public void printSemuaGaji(){
            System.out.println("=================DAFTAR GAJI PEGAWAI==================");
      for (int i=0;i<j;i++){
                if(i==0){
            System.out.println("------------------------------------------------------");
            System.out.println("Nama Dosen : " + listPegawai[i].getNama());
            System.out.println("Gaji Dosen : " + listPegawai[i].getGaji());
            System.out.println("======================================================");
                }else{
            System.out.println("------------------------------------------------------");
            System.out.println("Nama pegawai : " + listPegawai[i].getNama());
            System.out.println("Gaji pegawai: " + listPegawai[i].getGaji());
            System.out.println("======================================================");
                }
                }
        }
    }



