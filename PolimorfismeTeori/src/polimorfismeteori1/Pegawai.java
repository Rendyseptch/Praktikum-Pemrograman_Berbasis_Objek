/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismeteori1;

/**
 *
 * @author rendy
 */
public class Pegawai {
      protected String nama;
      protected int gaji;
    
 public Pegawai(){
     
 }     
 
public Pegawai(String nama, int gaji){
    this.gaji=gaji;
    this.nama=nama;
}
public int getGaji(){
    return gaji;
}

}
