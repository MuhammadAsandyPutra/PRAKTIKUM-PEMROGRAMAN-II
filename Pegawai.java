/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak203_2110817310002_muhammadasandyputra;
    public class Pegawai {
public String nama;
public String asal; //Pada baris ini Ubah tipe data menjadi String, yang awalnya Char, karena penggunaannya tidak tepat
public String jabatan;
public int umur;

public String getNama() {
return nama;
}
public String getAsal() {
return asal;
}
public void setJabatan(String j) {//Pada baris ini Tambahkan (String j) agar baris berikutnya  dapat dieksekusi
this.jabatan = j;
}
}