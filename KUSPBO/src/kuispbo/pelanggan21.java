/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    package kuispbo;

    /**
     *
     * @author rendy
     */
    public class pelanggan21 {
        private String idPelanggan;
        private String namaPelanggan;
        private String alamat;
        private int noHP;
        private hp21 hp;

       public  pelanggan21(){

                }
       public void SetIdPelanggan(String id){
           this.idPelanggan=id;
       }
       public void SetNamaPelanggan(String nama){
           this.namaPelanggan=nama;
       }
       public void SetAlamat(String alamat ){
           this.alamat=alamat;
       }
       public void SetNoHp(int NoHp ){
           this.noHP=NoHp;
       }
       public void SetHp(hp21 hp ){
           this.hp=hp;
       }
       public String getIdPelanggan( ){
           return idPelanggan;
       }
       public String getNamaPelanggan(){
           return namaPelanggan;
       }
       public String getAlamat(){
           return alamat;
       }
       public int getNohp(){
           return noHP;
       }
       public hp21 getHP(){
           return hp;
       }
       public void info(){
             String info = "";
        System.out.println("Id pelanggan         : " + this.idPelanggan );
        System.out.println("Nama Pelanggan       : " + this.namaPelanggan );
        System.out.println("Alamat               : " + this.alamat );
        System.out.println("No Hp                : " + this.noHP );

        }
    } 
