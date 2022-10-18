/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak202_211081710002_muhammadasandyputra;

public class Mobil {
    String merek,tahun_keluaran;
    int kapasitas,harga;
    long Pajak;
    String Pemilik;
    
    public void setPemilik(String NamaPemilik ) {
        this.Pemilik = NamaPemilik;
    }
    
    public void setPajak(int PK){
        this.Pajak = PK;
    }
       
    public String getPemilik(){
        return Pemilik;
    }
    
    public long getPajak(){
        return Pajak;
    }
    public void info(){
        System.out.println("Merek Mobil: "+merek);
        System.out.println("Harga: Rp. "+harga);
        System.out.println("Tahun Keluaran: "+tahun_keluaran);
        System.out.println("Kapasitas: "+kapasitas+"cc");
        this.Pajak=(long) (harga*0.02);
    }
}