/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg7.tugas;

/**
 *
 * @author rendy
 */
public class MainTugas {
    public static void main(String[] args) {
        Dosen d = new Dosen();
        d.setNama("Rendy Septian Pradana");
        d.setSKS(9);
        pegawai p = new pegawai();
        p.setNama("septian Rendy Pradana");
        daftarGaji gj = new daftarGaji(2);
        gj.addPegawai(d);
        gj.addPegawai(p);
        gj.printSemuaGaji();
 }
}
