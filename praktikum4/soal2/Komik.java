/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4.soal2;

public class Komik extends Buku {
    private int volume;
    private String sinopsis;
    
    public Komik(String j, String p, String t, Integer v, String s){
        super.judul=j;
        super.penulis=p;
        super.tahun= Integer.valueOf(t);
        this.volume=v;
        this.sinopsis=s;  
    }
    
    public String getKomikDetail(){
        return "\nData yang baru diinputkan adalah \nSebuah komik dengan judul \""+ judul +
                "\". Komik tersebut dibuat oleh "+ penulis+" \ndan diterbitkan pada tahun "+ tahun +
                ". Sampai saat ini komik tersebut memiliki jumlah volume sebanyak "+ getVolume() +" buah. \nSinopsis : "+getSinopsis();
        
    }

    /**
     * @return the volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * @return the sinopsis
     */
    public String getSinopsis() {
        return sinopsis;
    }

    /**
     * @param sinopsis the sinopsis to set
     */
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    
    
}
