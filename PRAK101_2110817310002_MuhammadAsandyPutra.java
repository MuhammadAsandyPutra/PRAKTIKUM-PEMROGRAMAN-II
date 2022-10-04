/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpemrograman;

/**
 *
 * @author acer
 */
import java.util.Locale;
import java.util.Scanner;
public class PRAK101_2110817310002_MuhammadAsandyPutra {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in).useLocale(Locale.US);
        String NAMA,LAHIR;
        String Bulan= null;
        int TanggalLahir,BulanLahir,TahunLahir,TinggiBadan;
        double BeratBadan;
        
        System.out.print("Masukkan Nama Lengkap: ");
        NAMA = in.nextLine();
        
        System.out.print("Masukkan Tempat Lahir: ");
        LAHIR = in.next();
        
        System.out.print("Masukkan Tanggal Lahir: ");
        TanggalLahir= in.nextInt();
        
        System.out.print("Masukkan Bulan Lahir: ");
        BulanLahir = in.nextInt();
        switch(BulanLahir){
            case 1:
                Bulan= "Januari";
                break;
            case 2:
                Bulan= "Februari";
                break;
            case 3:
                Bulan= "Maret";
                break;
            case 4:
                Bulan= "April";
                break;
            case 5:
                Bulan= "Mei";
                break;
            case 6:
                Bulan= "Juni";
                break;
            case 7:
                Bulan= "Juli";
                break;
            case 8:
                Bulan= "Agustus";
                break;
            case 9:
                Bulan= "September";
                break;
            case 10:
                Bulan= "Oktober";
                break;
            case 11:
                Bulan= "November";
                break;
            case 12:
                Bulan= "Desember";
                break;
                
        }
        System.out.print("Masukkan Tahun Lahir: ");
        TahunLahir= in.nextInt();
       
        System.out.print("Masukkan Tinggi Badan: ");
        TinggiBadan= in.nextInt();
        
        System.out.print("Masukkan Berat Badan: ");
        BeratBadan= in.nextDouble();
        in.nextLine();
        
        
        
        System.out.println("==========================");
        System.out.println("DATA TELAH DITAMBAHKAN");
        System.out.print("Nama Lengkap "+NAMA+", Lahir di "+LAHIR+" pada Tanggal "+TanggalLahir+" "+Bulan+" ");
        System.out.println( TahunLahir+" Tinggi Badan "+TinggiBadan+" cm dan Berat Badan "+BeratBadan+" kilogram");
    }
   
}
