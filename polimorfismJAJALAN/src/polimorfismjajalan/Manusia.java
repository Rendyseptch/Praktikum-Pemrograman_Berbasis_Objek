/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismjajalan;

/**
 *
 * @author rendy
 */
public class Manusia {
    public void nyalakanPerangkat(Elektronik perangkat){
        if(perangkat instanceof TelevisiJadul){
            System.out.println("jadul dengan input: "+((TelevisiJadul)perangkat).getModeIn());
            System.out.println("voltase :"+ ((TelevisiJadul) perangkat).getVoltase(22));
        }if(perangkat instanceof TelevisiModern){
            System.out.println("Modern dengan input: "+((TelevisiModern)perangkat).getModeIn());
            System.out.println("voltase :"+ ((TelevisiModern) perangkat).getVoltase(22));
    }
    }
}

