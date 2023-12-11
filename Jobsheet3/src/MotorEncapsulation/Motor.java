package MotorEncapsulation;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rendy
 */
public class Motor {
    public int kecepatan=0;
     public boolean  kontak0n=false;

     public void printStatus(){
         if (kontak0n==true){
             System.out.println("kontak On");
         }
         else{
             System.out.println("kontak OFF");
         }
         System.out.println("kecepatan "+ kecepatan+"\n");
     }
}
