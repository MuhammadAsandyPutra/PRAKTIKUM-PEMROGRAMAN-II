/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum4.soal1;

import java.util.Scanner;
public class Praktikum4Soal1 {
            
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        String Judul;
        String Penulis;
        int Tahun;
        
       
        System.out.print("Judul: ");
        Judul = in.nextLine();
        
        System.out.print("Penulis: ");
        Penulis = in.nextLine();
        
        System.out.print("Tahun Terbit: ");
        Tahun = in.nextInt();
        
        
        Buku b = new Buku(Judul, Penulis, Tahun);
        b.display();
    }
    
}
