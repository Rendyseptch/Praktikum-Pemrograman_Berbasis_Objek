/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet14pbopolimorfism.TUGASS;

/**
 *
 * @author rendy
 */
public class Barrier implements Destroyable{
    private int strength;
    
    public Barrier(int Strength){
        this.strength=Strength;
    } 
    public void setStrength(int strength){
        this.strength=strength;
    }
    public int getStrength(){   
        return strength;
    }

   @Override
    public void Destroyed() {
       strength-=   (strength*0.1);
    }
    public String getBarrierInfo(){
       
     String info ="Barrier Health\n"+"="+strength+"\n";
     return info;
    }

  
   
}
