/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpemrograman;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class PRAK103_2110817310002_MuhammadAsandyPutra {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
      
        int i=1;
        System.out.print("Masukkan Angka yang ingin Anda coba cek: ");
        int Angka = in.nextInt();
        do{ 
            if(Angka%7==0){
            continue;
        }if(i==5) 
            System.out.print(Angka);
            else System.out.print(Angka+", ");
            i++;
            Angka--;
        }while(i<=5);
        System.out.println("\n");
        System.out.println("=======================\n"+"Terima Kasih");
    }
    
    
}
