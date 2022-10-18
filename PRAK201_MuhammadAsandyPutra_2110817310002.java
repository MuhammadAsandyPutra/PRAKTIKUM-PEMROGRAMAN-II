/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak201_muhammadasandyputra_2110817310002;
public class PRAK201_MuhammadAsandyPutra_2110817310002 {
    public static void main(String[] args) {
        PembelianBuah Arumanis = new PembelianBuah("Arumanis ", 0.3f, 13, 5000);
        PembelianBuah Manalagi = new PembelianBuah("Manalagi ", 0.5f, 17, 7500);
        PembelianBuah Madu = new PembelianBuah("Mangga Madu", 0.375f, 12, 6500);
        
        Arumanis.displaystatus();
        System.out.println("");
        Manalagi.displaystatus();
        System.out.println("");   
        Madu.displaystatus();
        System.out.println("");
    }
}
