/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet14pbopolimorfism.TUGASS;

/**
 *
 * @author rendy
 */
public class Plant {
    public  void doDestroy (Destroyable d){
        if(d instanceof Zombie){
            Zombie z=(Zombie )d;
            z.destroyed();
        }else if(d instanceof WalkingZombie){
            Zombie wz=(WalkingZombie )d;
            wz.Destroyed();
            wz.heal();
        }else if(d instanceof JumpingZombie){
            Zombie jz=(JumpingZombie )d;
            jz.Destroyed();
            jz.heal();
        }
        else if(d instanceof Barrier){
            Barrier b=(Barrier )d;
            b.Destroyed();
           
        }
        
    }
}
