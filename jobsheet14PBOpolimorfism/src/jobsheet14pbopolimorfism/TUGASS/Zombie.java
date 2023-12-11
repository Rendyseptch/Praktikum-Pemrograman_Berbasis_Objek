/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet14pbopolimorfism.TUGASS;

/**
 *
 * @author rendy
 */
public  class Zombie implements Destroyable {
    protected int health;
    protected int level;
 
    public void heal(){
        
    }
    public void destroyed(){
    
    }
    
    public String getZombieInfo(){
        return "";
    }

    @Override
    public void Destroyed() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    }

