/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum3.soal2;
import java.util.Scanner;
import java.util.LinkedList;

public class Praktikum3Soal2 {

    static Scanner ln= new Scanner(System.in);
    
    public static void main(String[] args) {
       
       LinkedList<Negara> TotalNegara = new LinkedList<>();
       int b;
       b=ln.nextInt();
       ln.nextLine();
       
       for(int i=0; i<b; i++){
           TotalNegara.add(lnNegara());
       }
       while(!TotalNegara.isEmpty()){
           TotalNegara.poll().displayStatus();
       }   
      
    }
    public static Negara lnNegara(){
        String nama, jenisKepemimpinan, namaPemimpin;
        int tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan;
        nama=ln.nextLine();
        jenisKepemimpinan=ln.nextLine();
        namaPemimpin=ln.nextLine();
        
        if(Negara.isMonarki(jenisKepemimpinan)){
        return new Negara(nama, jenisKepemimpinan, namaPemimpin);
    }
       tanggalKemerdekaan=ln.nextInt();
       ln.nextLine();
       bulanKemerdekaan=ln.nextInt();
       ln.nextLine();
       tahunKemerdekaan=ln.nextInt();
       ln.nextLine();
        return new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
    }

}