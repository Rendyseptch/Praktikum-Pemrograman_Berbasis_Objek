/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet.pkg9.PERCOBAAN1.praktikum2;

/**
 *
 * @author rendy
 */
public class StaffTetap extends staff{
    public String golongan;
    public int asuransi;
    
    public StaffTetap(){
        
    }
    public StaffTetap(String nama, String alamat, String jk, int umur,
            int gaji, int lembur, int potongan, String golongan, int asuransi){
        super(nama, alamat, jk, umur, gaji, potongan, lembur);
        this.golongan=golongan;
        this.asuransi=asuransi;
    }
}
