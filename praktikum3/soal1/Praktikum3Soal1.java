/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum3.soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Praktikum3Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       LinkedList<Dadu> Acak = new LinkedList<>();
       
       int b= in.nextInt();
       int Total = 0;
       int Operasi;
       
       for(int i=1; i<=b; i++){
           Acak.add(new Dadu());   
        }
        for(int i=1; i<=b; i++){
            Operasi=Acak.poll().getNilai();
            System.out.println("dadu ke-"+i+" bernilai "+ Operasi);
            Total+=Operasi;
        }
        System.out.println("Total nilai dadu keseluruhan "+Total);
        
        }
}