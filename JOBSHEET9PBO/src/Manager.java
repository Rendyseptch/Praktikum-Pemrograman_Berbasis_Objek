/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rendy
 */
public class Manager extends karyawan {
    private double tunjangan;
    private String bagian; 
    private  Staff st[];
    
    public void setTunjangan(double tunjangan)
    {
        this.tunjangan=tunjangan;
    }
    public double getTunjangan()
    {
        return tunjangan;
    }
    public void setBagian(String bagian)
    {
        this.bagian=bagian;
    }
    public String getBagian()
    {
        return bagian;
    }
    public void  setStaff(Staff st[])
    {
        this.st=st;
    }
     public void  viewStaff()
    {
        int i;
        System.out.println("------------------");
        for(i=0; i<st.length;i++)
        {
            st[i].lihatInfo();
        }
        System.out.println("------------------");
    }
    public void lihatInfo()
    {
    System.out.println("Manager :"+this.getBagian());
    System.out.println("Nip :"+this.getNip());
    System.out.println("Nama :"+this.getNama());
    System.out.println("Golongan :"+this.getGolongan());
    System.out.printf("Tunjangan :%.0f\n",this.getTunjangan());
    System.out.printf("Gaji :%.0f\n",this.getGaji());
    System.out.println("Bagian :"+this.getBagian());
    this.viewStaff();
    }
    public double getGaji()
    {
     return super.getGaji()+tunjangan;   
    }
}
