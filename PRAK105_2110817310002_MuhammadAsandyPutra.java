/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpemrograman;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class PRAK105_2110817310002_MuhammadAsandyPutra {
    public static void main(String[] args) {
        double Phi = 3.14;
        double InputR,InputT;
        System.out.println("=============");
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Masukkan Jari-jari: ");
        InputR = in.nextDouble();
        System.out.print("Masukkan Tinggi: ");
        InputT = in.nextDouble();
        
        //Dengan rumus tabung Phi*r*r*t
        double Hasil = Phi*InputR*InputR*InputT;
        System.out.println("Volume Tabung dengan Jari-jari "+ InputR+" cm dan Tinggi "+InputT+" cm adalah "+String.format("%.3f",Hasil)+" m3");
    }
    
}
