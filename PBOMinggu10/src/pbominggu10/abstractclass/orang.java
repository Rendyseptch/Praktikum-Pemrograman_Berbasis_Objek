/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbominggu10.abstractclass;

/**
 *
 * @author rendy
 */
public class orang {
  
    private String nama;
    private hewan hewanPeliharaan;
    
    public orang(String nama)
    {
        this.nama=nama;
    }
    public void peliharaHewan (hewan hewanPeliharaan)
    {
       this.hewanPeliharaan= hewanPeliharaan; 
    }
    public void ajakPeliharaanJalanJalan()
    {
        System.out.println("Namaku " +this.nama);
        System.out.println("Hewan peliharaanku berjalan dengan cara:  " );
        this.hewanPeliharaan.bergerak();
        System.out.println("-------------------------------------------");
    }
 }
