package praktikum4.soal2;
import java.util.Scanner;
public class Praktikum4Soal2 {

    
    public static void main(String[] args) {
        String judul;
        String penulis;
        String tahun, genre, sinopsis;
        int pilihan, volume;
        
        
        Scanner in= new Scanner(System.in);
        System.out.println("Pilih buku yang ingin diinputkan: \n1 = Novel \n2 = Komik");
        System.out.print("Masukkan pilihan: ");
        pilihan = in.nextInt();
        in.nextLine();
    
        if (pilihan == 1){
            System.out.print("Judul: ");
            judul = in.nextLine();
            
            System.out.print("Penulis: ");
            penulis = in.nextLine();
            System.out.print("Tahun Terbit: ");
            tahun = in.nextLine();
            
            System.out.print("Genre: ");
            genre = in.nextLine();
            System.out.print("Sinopsis: ");
            sinopsis = in.nextLine();
            
            Novel a = new Novel(judul, penulis, tahun, genre, sinopsis);
            System.out.print(a.getNovelDetail());
        }
        else if(pilihan == 2){
            System.out.print("Judul: ");
            judul = in.nextLine();
            System.out.print("Penulis: ");
            penulis = in.nextLine();
            
            System.out.print("Tahun Terbit: ");
            tahun = in.nextLine();
            System.out.print("Volume: ");
            volume = in.nextInt();
            in.nextLine();
            System.out.print("Sinopsis: ");
            sinopsis = in.nextLine();
            
            Komik b = new Komik(judul, penulis, tahun, volume, sinopsis);
            System.out.println(b.getKomikDetail());
        }
        
    }
    
}