/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remedUTSPbo;

import utspbo.*;

/**
 *
 * @author rendy
 */
public class kasir {
    public int id_kasir;
    public String nama;
    public String notelp;
    
    public kasir(){
        
    }
    public kasir(int id, String nm, String notelp){
        this.id_kasir=id;
        this.nama=nm;
        this.notelp=notelp;
    }
    public void tampilKasir(){
        System.out.println("Id Kasir         : "+id_kasir);
        System.out.println("Nama Kasir       : "+nama);
        System.out.println("No Telp          : "+notelp);
        System.out.println("");

        
    }
  }

        