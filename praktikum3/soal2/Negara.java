/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.soal2;
//import yang digunakan
import java.util.HashMap;
public class Negara {
    private String nama, jenisKepemimpinan, namaPemimpin;
    private int tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan;
    private final HashMap<Integer, String> month= new HashMap<>();

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin){
        this.nama=nama;
        this.jenisKepemimpinan=jenisKepemimpinan;
        this.namaPemimpin=namaPemimpin;
    }
    
    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan){
        this.nama=nama;
        this.jenisKepemimpinan=jenisKepemimpinan;
        this.namaPemimpin=namaPemimpin;
        this.tanggalKemerdekaan=tanggalKemerdekaan;
        this.bulanKemerdekaan=bulanKemerdekaan;
        this.tahunKemerdekaan=tahunKemerdekaan;
        sinBulan();
    }
    
    private void sinBulan(){
        this.month.put(1, "Januari");
        this.month.put(2, "Februari");
        this.month.put(3, "Maret");
        this.month.put(4, "April");
        this.month.put(5, "Mei");
        this.month.put(6, "Juni");
        this.month.put(7, "Juli");
        this.month.put(8, "Agustus");
        this.month.put(9, "September");
        this.month.put(10, "Oktober");
        this.month.put(11, "November");
        this.month.put(12, "Desember");
    
    }
    
    public String getNama() {
        return  this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKepemimpinan() {
        return jenisKepemimpinan;
    }

    public void setJenisKepemimpinan(String jenisKepemimpinan) {
        this.jenisKepemimpinan = jenisKepemimpinan;
    }

    public String getNamaPemimpin() {
        return namaPemimpin;
    }

    public void setNamaPemimpin(String namaPemimpin) {
        this.namaPemimpin = namaPemimpin;
    }

    public int getTanggalKemerdekaan() {
        return tanggalKemerdekaan;
    }

    public void setTanggalKemerdekaan(int tanggalKemerdekaan) {
        this.tanggalKemerdekaan = tanggalKemerdekaan;
    }

    public int getBulanKemerdekaan() {
        return bulanKemerdekaan;
    }

    public void setBulanKemerdekaan(int bulanKemerdekaan) {
        this.bulanKemerdekaan = bulanKemerdekaan;
    }

    public void setTahunKemerdekaan(int tahunKemerdekaan) {
        this.tahunKemerdekaan = tahunKemerdekaan;
    }
    
    public int getAngkabulanKemerdekaan(){
        return this.bulanKemerdekaan;
        
    }
    public String getNamabulanKemerdekaan(){
        return this.month.get(this.bulanKemerdekaan);
    }

    
    public static boolean isMonarki(String jenisKepemimpinan){
        return jenisKepemimpinan.equalsIgnoreCase("Monarki");
    }
    
    public void displayStatus(){
        System.out.print("Negara ");
        System.out.print(this.nama);
        System.out.print(" mempunyai ");
        
        if(isMonarki(this.jenisKepemimpinan)){
            System.out.print("Raja");
        }else{
            System.out.print(jenisKepemimpinan);
        }   System.out.print(" bernama ");
            System.out.print(this.namaPemimpin+"\n");
            
        if (isMonarki(this.jenisKepemimpinan)){
            System.out.print("\n");
            
        }
        System.out.print("Deklarasi Kemerdekaan pada Tanggal ");
        System.out.print(this.tanggalKemerdekaan+" ");
        System.out.print(this.getNamabulanKemerdekaan()); 
        System.out.print(this.tahunKemerdekaan);
        System.out.println("\n\n");
       
    }
    
}
