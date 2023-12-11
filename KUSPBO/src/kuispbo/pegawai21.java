/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuispbo;

/**
 *
 * @author rendy
 */
public class pegawai21 {
    private String idPegawai;
    private String namaPegawai;
    private String jenisKelamin ;
    private int noHP ;
    
    public pegawai21(){
        
    }
     
    public void setIdPegawai(String id){
        this.idPegawai=id;
    }
    public void setNamaPegawai(String nama){
        this.namaPegawai=nama;
    }        
    public void setNoHP(int  NoHP ){
        this.noHP=NoHP;
    }
    public void setJenisKelamin(String  jenisKelamin ){
        this.jenisKelamin=jenisKelamin;
    }
    public String getidPegawai( ){
        return idPegawai;
    }
    public String getNamaPegawai( ){
        return namaPegawai;
    }
    public int noHP( ){
        return noHP;
    }
    public String getJeniskelamin( ){
        return idPegawai;
    }
    
    public void info(){
         String info = "";
    System.out.println("Id Pegawai           : " + this.idPegawai );
    System.out.println("Nama pegawai         : " + this.namaPegawai );
    System.out.println("No HP                : " + this.noHP );
    System.out.println("Jenis Kelamin        : " + this.jenisKelamin );
    }  
}
