/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_abstrak;

/**
 *
 * @author rendy
 */
public class persegiPanjang extends BangunDatar {
     
public int panjang;
public int lebar ;
public int tinggi;

persegiPanjang(){
    
}
persegiPanjang(int panjang, int lebar, int tinggi){
    this.panjang=panjang;
    this.lebar=lebar;
    this.tinggi=tinggi;
} 
@Override
    public double Luas() {
       return panjang*lebar*tinggi;  
    }
 
    public double Keliling() {
        return (panjang+lebar)*2; 
    }
    
     public void info(){
        
        System.out.println(" Keliling persegi panjang:"+this.Keliling());
        System.out.println(" luas persegi panjang    :"+Luas());
    }
}
