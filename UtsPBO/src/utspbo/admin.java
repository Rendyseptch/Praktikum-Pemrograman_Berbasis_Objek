/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbo;

/**
 *
 * @author rendy
 */
public class admin {
    public int id_admin;
    public String nama;
    public String notelp;
    
    public admin(){
        
    }
    public admin(int id, String nama, String notelp){
        this.id_admin=id;
        this.nama=nama;
        this.notelp=notelp;
    }
    public void tampil(){
        System.out.println("id cust : "+id_admin);
        System.out.println("nama    : "+nama);
        System.out.println("No Telp : "+notelp);
    }
  }

        