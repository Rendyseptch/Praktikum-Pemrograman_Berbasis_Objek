/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet.pkg9.PERCOBAAN1;

/**
 *
 * @author rendy
 */
public class inheritance1 {
    public static void main (String[]args){
        
        StaffTetap ST=new StaffTetap("Budi","Malang","Lakilaki",20,2000000,250000, 200000,"2A",100000);
        ST.tampilStaffTetap();
        
        StaffHarian SH= new StaffHarian("indah","Malang", "Perempuan", 27, 10000, 100000, 50000, 100);
        SH.tampilStaffHarian();
    }
}    
        
        
//        Manager M = new Manager();
//        M.nama="vivin";
//        M.alamat="Jl.Vinolia";
//        M.umur=25;
//        M.jk="Perempuan";
//        M.gaji= 3000000;
//        M.tunjangan=1000000;
//        M.tampilDataManager();
//        
//        
//       staff S=new staff();
//       S.nama="Lestari";
//       S.alamat="Malang";
//       S.umur=25;
//       S.jk="Perempuan";
//       S.gaji= 2000000;
//       S.lembur= 500000;
//       S.potongan= 250000;
//       S.tampilDataStaff();
//    }
//}
