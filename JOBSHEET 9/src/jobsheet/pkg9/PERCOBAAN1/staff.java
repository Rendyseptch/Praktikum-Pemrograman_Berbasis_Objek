/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet.pkg9.PERCOBAAN1;

/**
 *
 * @author rendy
 */
public class staff extends karyawan{
    public int lembur, potongan;
    
    public staff(){
        
    }
    public staff(String nama, String alamat, String jk, int umur,int gaji, int lembur, int potongan){
        super(nama,alamat,jk,umur,gaji);
        this.lembur=lembur;
        this.potongan=potongan;
    }
    public void tampilDataStaff(){
        super.tampilDataKaryawan();
         System.out.println("Lembur        ="  +lembur);
         System.out.println("potongan      ="  +potongan);
         System.out.println("Total Gaji    ="  +(gaji+lembur-potongan));
    }
}
