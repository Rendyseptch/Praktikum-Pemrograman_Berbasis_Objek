/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbo;

/**
 *
 * @author rendy
 */
public class customers {
   
    int id_cust;
    public String nama;
    public String notelp;
    
    public customers(){
        
    }
    public customers( int id, String nama,  String notelp){
        this.id_cust= id;
        this.nama= nama;
        this.notelp= notelp;
    }
    
    public void tampil(){
        
        System.out.println("id cust : "+id_cust);
        System.out.println("nama    : "+nama);
        System.out.println("No Telp : "+notelp);
    }
 }

