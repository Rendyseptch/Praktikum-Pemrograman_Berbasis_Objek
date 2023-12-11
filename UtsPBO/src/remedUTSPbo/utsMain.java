/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remedUTSPbo;


/**
 *
 * @author rendy
 */
import java.util.Scanner;
import java.time.LocalDate;
public class utsMain {
 
   
    
    public static void main (String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("====================PERSEWAAN KOMPONEN KOMPUTER========================");
        
        System.out.print(" Masukkan Id Anda     :");
        int id= input.nextInt();
        System.out.print(" Masukkan Nama Anda   :");
        String nama= input.next();
        System.out.print(" Masukkan No hp Anda  :");
        String nohp= input.next();
        System.out.print(" Masukkan Alamat Anda :");
        String alamat= input.next();
        Pelanggan c= new Pelanggan(id,nama,nohp,alamat);
        System.out.println("=================DATA PELANGGAN====================");
        c.tampilPelanggan();
        
        kasir ad1= new kasir();
        ad1.id_kasir=221;
        ad1.nama="septian";
        ad1.notelp="093773843";
        
        
        kasir Kasir= new kasir();
        Kasir.nama= "raka";
        Kasir.id_kasir= 123;
        Kasir.notelp= "288292930";
        
        komputer pk1= new komputer();
        pk1.namaBarang="Apple Imac 27 inch with retina";
        pk1.Os= "Windows";
        pk1.monitor="24 inch" ;
        pk1.processor="intel core i5"; 
        pk1.harga=2500000;
        pk1.dp= 1000000;
        
        komputer pk2= new komputer();
        pk2.namaBarang="Lenovo thinkCentre m93z";
        pk2.Os= "Windows";
        pk2.monitor="23 inch" ;
        pk2.processor="intel core i5"; 
        pk2.harga=5000000;
        pk2.dp= 1000000;

       
        miniKomputer k1= new miniKomputer();
        k1.namaBarang= "Mini Komputer Dell";
        k1.harga=1000000;
        k1.dp= 0;
        k1.jumProc="2 proc";
        
        miniKomputer k2= new miniKomputer();
        k2.namaBarang= "Mini Komputer samsung";
        k2.harga=1000000;
        k2.dp= 0;
        k2.jumProc="2 proc";
        
         
       
        tablet m1 = new tablet();
        m1.namaBarang="samsung galaxy tab";
        m1.internal="512 gb";
        m1.kamera= "24 mp";
        m1.memory="28 gb";
        m1.harga=1500000;
        m1.pen="samsung";
        m1.dp= 500000;
        
        
        tablet m2 = new tablet();
        m2.namaBarang="ipad 112";
        m2.internal="512 gb";
        m2.kamera= "24 mp";
        m2.memory="28 gb";
        m2.harga=1500000;
        m2.pen="samsung";
        m2.dp= 500000;
        

                
        
        Rental tt= new Rental();
        Pelanggan t1= new Pelanggan();
        tt.id_rental=  244;
        tt.tanggal_sewa=LocalDate.now();  
        tt.tanggal_kembali=LocalDate.now().plusDays(3);
        tt.kasir= Kasir ;
        tt.pelanggan=c;
        

        
        System.out.println("======================----------------------");
        System.out.println("----------------------======================");
        System.out.println(" ");
        System.out.println("  Silahkan Pilih barang yang akan disewa  ");
        System.out.println("1. Komputer         (1.Apple Imac.)");
        System.out.println("                    (2.Lenovo thinkCentre)");
        System.out.println("2. Mini Komputer    (3.Mini Komputer Dell)");
        System.out.println("                    (4.Mini Komputer Sammsung)");
        System.out.println("3. Tablet           (5.samsung galaxy tab)");
        System.out.println("                    (6.ipad 112)");
        System.out.println(" ");
        System.out.println("======================----------------------");
        System.out.println("----------------------======================");
       
        System.out.println("Berapa banyak yang akan disewa: " );
        int jml= input.nextInt();
        Rental rr= new Rental(jml);
        for(int i=0; i< jml; i++){
            System.out.println("-------------" );
            System.out.println("**Barang  "+(i+1)+"**" );
            System.out.println("-------------" );
            int kode= input.nextInt();
        
        if(kode==1){
            pk1.tampilKomputer();
            rr.addItem(pk1);
          
        }else if(kode==2){
            pk2.tampilKomputer();
            rr.addItem(pk2);
                    
        }else if(kode==3){
            k1.tampilMiniKomputer();
            rr.addItem(k1);
            
        }else if(kode==4){
            k2.tampilMiniKomputer();
            rr.addItem(k2);
            
                    
        }else if(kode==5){
            m1.tampilTablet();
            rr.addItem(m1);
            
        }else if(kode==6){
            m2.tampilTablet();
            rr.addItem(m2);
        }
    }    
        System.out.println("---------------------------------------------------");
        System.out.print("Syarat persewaan barang : ");
        Barang brg= new Barang();
        brg.Syarat();
        
       
        tt.setTglKembali(3);
        tt.tampilRental();
        c.tampilPelanggan();
        ad1.tampilKasir();
        
        System.out.println("Total Jumlah  Barang yang akan Disewa : "+jml);
        if(jml<3){
            m1.Denda();
            tt.denda1();
        }else if(jml<5){
            pk1.Denda();
            tt.denda2();
        }else if(jml>=5){
            m1.Denda();
            tt.denda3();
        }
        System.out.println("");
        System.out.println("\t\tDENGAN BARANG YANG DISEWA");
        rr.info();
              System.out.println("=============================================");
              System.out.println("\t\tTERIMAKASIH\t\t");
              System.out.println("=============================================");
        }
        
        
    }

    

    

