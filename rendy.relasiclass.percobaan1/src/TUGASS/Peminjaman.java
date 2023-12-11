/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASS;

/**
 *
 * @author rendy
 */
public class Peminjaman {
    private Buku buku;
    private Mahasiswa mhw;
    Peminjaman(Buku bk,Mahasiswa ms){
        this.buku=bk;
        this.mhw=ms;
    }
    public void setBuku(Buku bk){
        buku = bk;
    }
    public Buku getBuku(){
        return buku;
    }
    public void setMahasiswa(Mahasiswa ms){
        mhw =ms;
    }
    public Mahasiswa getMahasiswa(){
        return mhw;
    }
    public void print(){
        buku.print();
        mhw.print();
    }
}
