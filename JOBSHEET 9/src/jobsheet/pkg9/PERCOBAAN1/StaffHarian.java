/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet.pkg9.PERCOBAAN1;

/**
 *
 * @author rendy
 */
public class StaffHarian extends staff{
   public int jmlJamKerja;
   
   public StaffHarian(){
       
   }
   public StaffHarian(String nama, String alamat, String jk, int umur,
           int gaji, int lembur, int potongan, int jmlJamKerja){
       super(nama,alamat,jk,umur,gaji,lembur,potongan);
       this.jmlJamKerja=jmlJamKerja;
   }
   public void tampilStaffHarian(){
     System.out.println("===============Data Staff Harian================");
     super.tampilDataStaff();
     System.out.println("Jumlah jam kerja="+jmlJamKerja);
     System.out.println("Gaji bersih     ="+(gaji*jmlJamKerja+lembur-potongan));
   }
}
