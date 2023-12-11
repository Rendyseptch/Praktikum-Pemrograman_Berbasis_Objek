/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismeteori1;

/**
 *
 * @author rendy
 */
public class Programmer extends Pegawai {
    private int bonus;
    
    public  Programmer(String nama, int gaji, int Bonus){
    super(nama,gaji);
    this.bonus=Bonus;
    }
    public int getGaji(){
    return super.gaji;
    }
    public int getBonus(){
        return bonus;
    }
    
    
}
