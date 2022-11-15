/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4.soal1;

public class Buku {
    private String Judul;
    private String Penulis;
    private int Tahun;
    
    
    public Buku(String j, String p, int t){
        Judul=j;
        Penulis=p;
        Tahun=t;
    }
    
    public void display(){        
        System.out.println("Detail Buku: ");
        System.out.println("Judul adalah "+ getJudul());
        System.out.println("Penulis adalah "+getPenulis());
        System.out.println("Tahun terbit adalah "+getTahun());
    }
    
    public String getJudul() {
        return Judul;
    }

    public void setJudul(String Judul) {
        this.Judul = Judul;
    }

    public String getPenulis() {
        return Penulis;
    }

    public void setPenulis(String Penulis) {
        this.Penulis = Penulis;
    }

    public int getTahun() {
        return Tahun;
    }

    public void setTahun(int Tahun) {
        this.Tahun = Tahun;
    }
    
    

}




