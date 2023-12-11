/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet14pbopolimorfism.TUGASS;

/**
 *
 * @author rendy
 */
public class WalkingZombie extends Zombie {
    
    public WalkingZombie(int health, int level){
        this.health=health;
        this.level=level;
    }
    @Override
    public  void heal(){
        if(super.level ==1){
        super.health+=0.03*super.health;
    }else if (super.level ==1){
        super.health+=(0.04*super.health); 
    }else if(super.level==3){
        super.health+=(0.05*super.health); 
        }
    }
    @Override
    public void destroyed(){
        super.health-=(super.health*0.2);
    }
    @Override
    public String getZombieInfo(){
      String info= super.getZombieInfo()+"\n";
     info+= "Walking zombie data=\n"+"Health="+health +"\n"+"Level="+level+"\n";
     return info; 
    }
}
