/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ltpolimorfisme;

/**
 *
 * @author rendy
 */
public class TelevisiModern extends Elektronik{
    private String modeInput;
     public TelevisiModern(){
        
    }
    public TelevisiModern(String modeInput){
       this.modeInput=modeInput;
    }
    public String   getModeInput(){
        return modeInput;
    }
}
