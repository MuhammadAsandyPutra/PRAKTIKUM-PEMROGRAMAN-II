/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak201_muhammadasandyputra_2110817310002;

public class PembelianBuah {
    String nama;
    float Berat;
    int Jumlah_Beli,Harga_Satuan;
    
    public PembelianBuah(String n, float Brt, int Jumlah,int Satuan){
        nama = n;
        Berat = Brt;
        Jumlah_Beli = Jumlah;
        Harga_Satuan = Satuan;      
    }
    public void displaystatus(){
        System.out.println("Nama Mangga : "+nama);  
        System.out.println("Berat : "+Berat+" kg");
        System.out.println("Jumlah Beli : "+Jumlah_Beli);
        System.out.println("Total Berat : "+Berat*Jumlah_Beli+" kg");
        System.out.println("Total Harga : Rp. "+Harga_Satuan*Jumlah_Beli);      
}          
}
