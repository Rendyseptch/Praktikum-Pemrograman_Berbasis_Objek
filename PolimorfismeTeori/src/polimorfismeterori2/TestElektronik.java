/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismeterori2;

/**
 *
 * @author rendy
 */
public class TestElektronik {
    public static void main( String[] args){
        Manusia indro = new Manusia();
        TelevisiJadul tvjadul  = new TelevisiJadul("DVI");
        TelevisiModern tvmodern= new TelevisiModern("HDMI");
        
        indro.nyalakanPerangkat(tvjadul);
        indro.nyalakanPerangkat(tvmodern);
       
    }
}
