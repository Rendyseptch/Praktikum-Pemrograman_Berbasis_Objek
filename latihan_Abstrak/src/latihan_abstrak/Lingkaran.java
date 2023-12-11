/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_abstrak;

/**
 *
 * @author rendy
 */
public class Lingkaran extends BangunDatar  {
    public double phi=3.14;
    public double r;
    
   Lingkaran(){
       
   }
   Lingkaran( double r){
       this.r=r;
   }

    @Override
    double Luas() {
        return phi*r*r;
    }

    @Override
    double Keliling() {
        return 2*phi*r;
    }
    
    public void info(){
        System.out.println(" --------------------------------------------");
        System.out.println(" keliling lingkaran:"+this.Keliling());
        System.out.println(" luas lingkaran    :"+this.Luas());
    }
}
