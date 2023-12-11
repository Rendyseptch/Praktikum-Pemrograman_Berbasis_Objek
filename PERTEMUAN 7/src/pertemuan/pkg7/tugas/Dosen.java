/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg7.tugas;

/**
 *
 * @author rendy
 */
public class Dosen extends pegawai {
    private int jumlahSKS;
    private int TARIF_SKS = 120000;
 
 public Dosen(){
 
 }
 public Dosen(String nip, String nama, String alamat) {
    super(nip, nama, alamat);
 }
 
 public void setSKS(int SKS){
 this.jumlahSKS = SKS;
 }
 public int getGaji(){
    int total_gaji = jumlahSKS * TARIF_SKS;
    return total_gaji + super.getGaji();
 }
}
