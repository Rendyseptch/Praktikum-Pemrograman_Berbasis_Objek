/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ltpolimorfisme;

/**
 *
 * @author rendy
 */
public class Manusia {
   public void nyalakanPerangkat(Elektronik perangkat){
     if (perangkat instanceof TelevisiJadul){
       System.out.println("Nyalakan telvisi jadul dengan input "+((TelevisiJadul) perangkat).getModeInput());
       System.out.println("Votase televisi : "+perangkat.getVoltase(220));
       
 } if  (perangkat instanceof TelevisiModern){
       System.out.println("Nyalakan telvisi modern dengan input "+((TelevisiModern)perangkat).getModeInput());
       System.out.println("Votase televisi : "+perangkat.getVoltase(220));
           
        } 
    }
   
            
}
