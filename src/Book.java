public class Book {
    //pret,titlu,autor

    double pret;
    String titlu;
    String autor;

    public Book() {
        pret = 100;
        autor = "Unknown";
        titlu = "Unknown";
    }

    public Book(double pret, String titlu) {
        this.pret = pret;
        this.titlu = titlu;
    }

    public Book(double pret, String titlu, String autor) {
        this.pret = pret;
        this.titlu = titlu;
        this.autor = autor;
    }

    public double getPret(){
        return pret;
    }
    public String afiseaza(){
        return "Cartea" + titlu + "are ca autor" + autor;
    }

}

