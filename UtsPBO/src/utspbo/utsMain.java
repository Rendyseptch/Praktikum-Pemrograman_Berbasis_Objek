/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbo;

/**
 *
 * @author rendy
 */
public class utsMain {
    public static void main (String[]args){
         
        customers c= new customers();
        c.id_cust= 0001;
        c.nama="Rendy";
        c.notelp="082338849";

        admin ad= new admin();
        ad.id_admin=221;
        ad.nama="septian";
        ad.notelp="093773843";
        
        komputer pk= new komputer();
        pk.namaBarang= "komputer";
        pk.tipe= "a22";
        pk.tahunKeluaran=2011;
        pk.warna= "putih";
        pk.hargaSewa= 2500000;
        pk.dp= 1000000;
        pk.monitor="24 inch" ;
        pk.ram= "16 gb";
        pk.processor="intel core i7";        
        
        
        miniKomputer k1= new miniKomputer();
        k1.namaBarang= "Mini Komputer";
        k1.tipe= "b11";
        k1.tahunKeluaran=2012;
        k1.warna= "Hitam";
        k1.hargaSewa= 500000;
        k1.dp= 0;
        k1.jumProc="2 proc";
        
        
      
        tablet m1 = new tablet();
        m1.namaBarang= "Tablet";
        m1.tipe= "b11";
        m1.tahunKeluaran=2019;
        m1.warna= "Hijau";
        m1.hargaSewa= 1500000;
        m1.dp= 500000;
        m1.internal="512 gb";
        m1.kamera= "24 mp";
        m1.memory="28 gb";
                
        Transaksi tt= new Transaksi();
        tt.id_transaksi=  244;
        tt.tanggal_transaksi= 22092022;
        
        System.out.println("==============STRUK PENYEWAAN=============== ");
        c.tampil();
        System.out.println("---------------------------------------------");
        ad.tampil();
        System.out.println("---------------------------------------------");
        pk.tampil();
        System.out.println("=============================================");
        k1.tampil();
        System.out.println("=============================================");
        m1.tampil();
        
        
    }

   
    }

