/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg7;

/**
 *
 * @author rendy
 */
public class classB extends classA {
    private int z;
  
    public void setZ(int z){
      this.z=z;
    }
    public void getNilaiZ(int z){
        this.z=z;
    }
    
     public void getNilaiZ(){
       System.out.println("nilai z: "+ z);
     }
     public void getjumlah(){
       System.out.println("jumlah: "+ (x+y+z));
     }
    

}
