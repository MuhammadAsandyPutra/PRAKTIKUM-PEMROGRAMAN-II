/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpemrograman;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class PRAK102_2110817310002_MuhammadAsandyPutra {
    
    public static void main(String[] args) {
        int HitunganInput;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("=========================");
        System.out.println("Masukkan Input: ");
        HitunganInput = in.nextInt();
        
        int a;
        int j = 1;
        while(j <= 7){
            a=HitunganInput;
          if(HitunganInput%2==0 && j==7){
            a=a/2-1;
            System.out.print(a+" \n");
            
        } else if(HitunganInput%2==0){
            a=a/2-1;
            System.out.print(a+", ");
            
        } else if (j==7){
              System.out.print(HitunganInput+" \n");
              
        }else{
              System.out.print(HitunganInput+", ");
        }
          
        HitunganInput++;
        j++;
       }        
    }
    
    
}
