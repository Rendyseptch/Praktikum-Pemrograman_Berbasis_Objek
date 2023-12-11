/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbominggu10.abstractclass;

/**
 *
 * @author rendy
 */
public class Program {
    public static void main (String[] args){
        kucing kucingKampung = new kucing ();
        ikan lumbaLumba= new ikan();
        
        orang ani = new orang("Ani");
        orang budi = new orang ("Budi");
        
        ani.peliharaHewan(kucingKampung);
        budi.peliharaHewan(lumbaLumba);
        
        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}
