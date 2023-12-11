/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_abstrak;

/**
 *
 * @author rendy
 */
public class Main {
  public static void main( String[]args) {

      persegiPanjang pp= new persegiPanjang(10, 23,7);
      Lingkaran ling= new Lingkaran(23);
      
  pp.Luas();
  pp.Keliling();
  ling.Keliling();
  ling.Luas();
  
  pp.info();
  ling.info();
  }
  
}
