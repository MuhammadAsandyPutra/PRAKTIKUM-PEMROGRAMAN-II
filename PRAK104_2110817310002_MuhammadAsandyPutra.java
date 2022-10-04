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
public class PRAK104_2110817310002_MuhammadAsandyPutra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int InputAngka1,InputAngka2,InputAngka3,InputAngka4,InputAngka5,InputAngka6;
        int HasilAndi,HasilBudi;
        System.out.println("========================");
        System.out.print("Input Angka Kartu Andi: ");
        InputAngka1 = in.nextInt();
        InputAngka2 = in.nextInt();
        InputAngka3 = in.nextInt();
        
        System.out.print("Input Angka Kartu Budi: ");
        InputAngka4 = in.nextInt();
        InputAngka5 = in.nextInt();
        InputAngka6 = in.nextInt();
        
        System.out.println("========================");
        HasilAndi = InputAngka1+InputAngka2+InputAngka3;
        HasilBudi = InputAngka4+InputAngka5+InputAngka6;
        
        if (HasilAndi>HasilBudi){
            System.out.print("Andi Menang!");
            
        }else if (HasilAndi==HasilBudi){
            System.out.println("Seri!");
        
        
    }else
            System.out.println("Budi Menang!");
    
    
}
}
