package praktikum4.soal2;

public class Novel extends Buku {
    private String genre;
    private String sinopsis;
    
    public Novel(String j, String p, String t, String g, String s){
        super.judul = j;
        super.penulis = p;
        super.tahun = Integer.valueOf(t);
        this.genre=g;
        this.sinopsis=s;
    
    }
    
    public String getNovelDetail(){
        return "\nData yang baru diinputkan adalah \nSebuah Novel bergenre " + getGenre() + " dengan judul \""+ judul
                +"\". Novel tersebut ditulis oleh "+ penulis + " dan diterbitkan pada tahun "+ tahun+" \nSinopsis : "+ getSinopsis();
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}