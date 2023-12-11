/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet14pbopolimorfism;

/**
 *
 * @author rendy
 */
public class Tester4 {
    public static void main (String[] args){
        Owner ow =new Owner();
        ElectricityBill eBill= new  ElectricityBill(5, "R-1");
        ow.pay(eBill);//pay for elecrticity bill
        System.out.println("------------------------------");
    
        PermanentEmployee pEmp= new PermanentEmployee("Dedik", 500);
        ow.pay(pEmp);//Pay permanent employee
        System.out.println("------------------------------");
        
        InternshipEmployee iEmp= new InternshipEmployee("Sunarto", 5);
        ow.showMyEmployee(pEmp);//show permanent employee info
        System.out.println("------------------------------");
        ow.showMyEmployee(iEmp);//show internship employee info
        
      
    }
}
    