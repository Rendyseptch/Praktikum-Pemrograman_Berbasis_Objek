/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg7.tugas;

/**
 *
 * @author rendy
 */
public class pegawai {
     public String nip;
     public String nama;
     public String alamat;
     
     pegawai(){
     }
     
     pegawai(String nip, String nama, String alamat){
         this.nip=nip;
         this.nama=nama;
         this.alamat=alamat;
     }
     public void setNip(String nip){
         this.nama=nama;
     }
     public String getNip(){
         return nama;
 }
     public void setNama(String nama){
         this.nama=nama;
     }
     public String getNama(){
         return nama;
 }
     public void setAlamat(String alamat){
         this.alamat=alamat;
     }
     public String getAlamat(){
         return alamat;
         
 }
     public int getGaji(){
         return 4000000;
     }
}
