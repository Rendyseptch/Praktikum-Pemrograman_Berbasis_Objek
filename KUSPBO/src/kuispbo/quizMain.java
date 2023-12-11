/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuispbo;

/**
 *
 * @author rendy
 */
import java.util.Date;
public class quizMain {
    
   public static void main (String[]args){
   System.out.println("==================================================================");
   System.out.println("                  SELAMAT DATANG DI RSP SERVICE                   ");
   System.out.println("=================================================================="); 
       
   System.out.println("==========---------------DATA HANDPHONE -----------------========="); 
        hp21 h = new hp21();
        h.setIMEI(11234);
        h.setMerk("Realme");
        h.setJenisKerusakan("lcd mati");
        h.info();
        System.out.println();
        
    System.out.println("==========---------------DATA PELANGGAN-----------------========="); 
        pelanggan21 pl= new pelanggan21();
        pl.SetIdPelanggan("1233yth");
        pl.SetNamaPelanggan("Rendy");
        pl.SetAlamat("ponorogo");
        pl. SetNoHp(682337);
        pl.SetHp(h);
        pl.info();
        System.out.println();
        
    System.out.println("==========--------------INFORMASI PEGAWAI ---------------=========");   
       
        pegawai21 pw = new pegawai21();
        pw.setIdPegawai("15226uj");
        pw.setNamaPegawai("Septaian");
        pw.setNoHP(628272);       
        pw.setJenisKelamin("Laki laki"); 
        pw.info();
        System.out.println();
        
    System.out.println("==========---------------PEMBAYARAN---------------------========="); 
        
        Date tgl = new Date();
        transaksiServiceHp21 trs = new transaksiServiceHp21("124254",tgl) ;
        trs.setPegawai(pw);
        trs.setPelanggan(pl);
        trs.setTotalPembayaran(900000);
        trs.StrukPembayaran();
        
     System.out.println("================================================================="); 
     System.out.println("==========------------STRUK PEMBAYARAN------------------=========");
     System.out.println("================================================================="); 
      h.info();
      System.out.println();
      pl.info();
      System.out.println();
      pw.info();
      System.out.println();
      trs.StrukPembayaran();
      System.out.println();
      
     System.out.println("================================================================="); 
     System.out.println("                       TERIMA KASIH                              ");
     System.out.println("=================================================================");
    }
}
