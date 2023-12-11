/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismeteori1;

/**
 *
 * @author rendy
 */
public class TestBayaran {
    public static void main (String[] args)
    {
    Manajer man= new Manajer("Agus", 800, 50);
    Programmer prog= new Programmer ("Budi", 600, 30);
    Bayaran hr= new Bayaran ();
    
    System.out.println("Bayaran Manajer: "+ hr.hitungBayaran(man));
    System.out.println("Bayaran Programmer: "+ hr.hitungBayaran(prog));
    
    }
}
