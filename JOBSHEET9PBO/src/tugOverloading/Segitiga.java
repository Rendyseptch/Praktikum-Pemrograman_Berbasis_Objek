/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugOverloading;

/**
 *
 * @author rendy
 */
public class Segitiga {
    private int sudut;
    
    public int totalSudut(int sudutA){
       return sudut=180-sudutA;
    }
     public int sudut(int sudutA, int sudutB){
      return  sudut=180-(sudutA + sudutB);
 
    }
     public int keliling(int sisiA, int sisiB, int sisiC){
        return sisiA + sisiB+ sisiC;
       
    }
     public double keliling(int sisiA, int sisiB){
        double c =(Math.sqrt(Math.pow(sisiA, 2))+Math.pow(sisiB,2));
        return sisiA +sisiB+ c;
    }
}
