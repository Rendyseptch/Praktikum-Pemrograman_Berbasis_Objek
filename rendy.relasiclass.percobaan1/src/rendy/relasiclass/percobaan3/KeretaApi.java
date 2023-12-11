/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rendy.relasiclass.percobaan3;

/**
 *
 * @author rendy
 */
public class Keretaapi {
    private String nama;
    private String kelas;
    private pegawai masinis;
    private pegawai asisten;

     Keretaapi(String nama, String kelas, pegawai masinis){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    Keretaapi(String nama, String kelas, pegawai masinis, pegawai asisten){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
//setter
    }
     public void setNama(String nama){
        this.nama = nama;
    }

    public void setKelas(String kelas){
        this.kelas = kelas;
    }

    public void setMasinis(pegawai masinis){
        this.masinis = masinis;
    }

    public void setAsisten(pegawai asisten){
        this.asisten = asisten;
    }

    //Getter
    public String getNama(){
        return nama;
    }

    public String getKelas(){
        return kelas;
    }

    public pegawai getMasinis(){
        return masinis;
    }

    public pegawai getAsisten(){
        return asisten;
    }
    public String info() {
    String info = "";
    info += "Nama: " + this.nama + "\n";
    info += "Kelas: " + this.kelas + "\n";
    info += "Masinis: " + this.masinis.info() + "\n";
//        info += "Asisten: " + this.asisten.info() + "\n";
        return info;
        }



}
    