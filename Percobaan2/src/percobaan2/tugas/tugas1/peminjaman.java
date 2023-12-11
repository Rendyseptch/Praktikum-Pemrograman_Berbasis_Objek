/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan2.tugas.tugas1;

/**
 *
 * @author rendy
 */
public class peminjaman {
  public int id;
  public String namaMember;
  public String namaGame;
  public double  harga;
  public int lamaSewa;
    
  public double hargaBayar(){
      return harga*lamaSewa;
  }
  
  public void tampil(){
      System.out.println("Id           : "+ id);
      System.out.println("Nama Member  : "+ namaMember);
      System.out.println("Nama Game    : "+ namaGame);
      System.out.println("Harga Bayar  : "+ hargaBayar());
  }
}
