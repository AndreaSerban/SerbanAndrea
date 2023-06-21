public class Animal {

    private String nume;
    private String culoare;
    private boolean vegetarian;

    public Animal(String nume, boolean vegetarian) {
        this.nume = nume;
        this.vegetarian = vegetarian;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public Animal(String nume, String culoare, boolean vegetarian) {
        nume = "Unknowm";
        culoare = "Unknowm";
        vegetarian = false;


    }

    public void mananca () {
        System.out.println(nume + "mananca");
    }
    public void doarme (){
        System.out.println(nume + "doarme");

    }
    public String afiseaza (){
        return nume + "are culoarea" + culoare;
    }
}