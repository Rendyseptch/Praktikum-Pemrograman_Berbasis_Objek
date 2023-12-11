/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

import Tugas1.*;

/**
 *
 * @author rendy
 */
public class EncapTest {
    public static void main (String args[])
    {
    EncapDemo encap = new EncapDemo();
    encap.setName("james");
//    encap.setAge(35);
    encap.setAge(14);
    System.out.println("Name : " + encap.getName());
    System.out.println("Age : " + encap.getAge());
    
    }
}
