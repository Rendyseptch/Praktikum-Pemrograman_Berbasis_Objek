/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbominggu10.abstractclass;

/**
 *
 * @author rendy
 */
public abstract class hewan {
    private int umur;
    protected hewan()
    {
       this.umur=0; 
    }
    public void bertambahUmur()
    {
        this.umur += 1;
    }
    public abstract void bergerak();
}
