/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak203_2110817310002_muhammadasandyputra;

public class PRAK203_2110817310002_MuhammadAsandyPutra {
    public static void main(String[] args) {
        
Pegawai p1 = new Pegawai();
p1.nama = "Roi";//Pada baris ini terjadi kesalahan pada awalnya karena kurangnya tanda (;)
p1.asal = "Kingdom of Orvel";
p1.setJabatan("Assasin");
p1.umur = 17;//ini ditambahkan sesuai dengan output agar nilai dari umur tidak kosong atau menjadi 0

System.out.println("Nama Pegawai: " + p1.getNama());
System.out.println("Asal: " + p1.getAsal());
System.out.println("Jabatan: " + p1.jabatan);
System.out.println("Umur: " + p1.umur+" Tahun"); // Tambahkan " Tahun" dibelakang p1.umur agar sesuai dengan output
}
}