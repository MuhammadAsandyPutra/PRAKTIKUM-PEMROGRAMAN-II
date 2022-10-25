/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.soal1;

public class Dadu {
   private int Nilai;
   
   public Dadu(){
       this.acakNilai();
   }
   
   public final void acakNilai(){
        this.Nilai=(int)(1+Math.random()*(6));
   }
   public int getNilai(){
       return this.Nilai;
   }
    
}

