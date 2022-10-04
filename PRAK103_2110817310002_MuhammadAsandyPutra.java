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
        int InputAngka1,InputAngka2,InputAngka3,InputAngka4,InputAngka5,InputAngka6,i;
        int PointAndi=0,PointBudi=0;
        
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
        int [] Andi0 = {InputAngka1,InputAngka2,InputAngka3};
        int [] Budi0 = {InputAngka4,InputAngka5,InputAngka6};
        
        
        for(i=0;i<3;i++){
            if(Andi0[i]>Budi0[i]){
                PointAndi++;
            }else if (Andi0[i] < Budi0[i]){
                PointBudi++;
            }
        }
        
        if (PointAndi>PointBudi){
            System.out.print("Andi Menang!");
            
        }else if (PointAndi==PointBudi){
            System.out.println("Seri!");
        
        
    }else
            System.out.println("Budi Menang!");
    
    
}
}
