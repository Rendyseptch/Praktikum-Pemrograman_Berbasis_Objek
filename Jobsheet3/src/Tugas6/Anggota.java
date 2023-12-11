/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;



/**
 *
 * @author rendy
 */
public class Anggota {
    private String nama;
    private String noKtp;
    private int limit;
    private int pinjaman;
    private int Angsuran;
    
    Anggota(String noKtp, String nama, int limit){
            this.nama= nama;
            this.noKtp =noKtp;
            this.limit=limit;
}
            
      public String getNama(){
        return nama;
    }   
       public int getLimitPinjaman(){
        return limit;
    }
    
    public void pinjam(int pinjaman){
        if(pinjaman> limit){
            System.out.println("maaf pinjaman anda melampaui batas limit");
        }
        else{
            this.pinjaman= pinjaman;
             System.out.println("jumlah pinjaman anda "+ pinjaman);
        }
    }
    //modifikasi
     public void angsur(int Angsuran ){
        if (Angsuran > limit) {
        System.out.println(" angsuran  anda melebihi limit ");
    }else if (Angsuran < pinjaman * 0.1 ){
        System.out.println(" Maaf, angsuran harus 10% dari jumlah pinjaman");
    }
       
        else {
 this.Angsuran = Angsuran;
        }
     }
  public void setNoKTP(String noktp){
        this.noKtp = noktp;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setLimit(int limit){
        this.limit = limit;
    }


    public int getJumlahPinjaman(){
        pinjaman= pinjaman-Angsuran;
        return pinjaman;
    }
}


