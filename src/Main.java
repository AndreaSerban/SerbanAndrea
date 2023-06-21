public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        DemoClass obiect1 = new DemoClass();
        System.out.println(obiect1.x);

        DemoClass obiect2 = new DemoClass();
        System.out.println(obiect2.x);

        obiect1.x= 6;
        System.out.println(obiect1.x);

        obiect1.afiseazatext();

        Human cristina = new Human("test@test.com","test");
        //atribuim valori
        //cristina.email= "cristina@test.com";
        cristina.verify();
        cristina.sendEmail();
        System.out.println(cristina.getEmail());
        Human jon = new Human("jon@test.com", "test"); //adaugam un obiect nou
        //jon.address ="Test Street 123";
        System.out.println(jon.getAddress());
        System.out.println(jon.getEmail());

        cristina.planeta = "Earth";
        jon.planeta = "Mars";
        System.out.println(cristina.planeta + jon.planeta);

        Book book1 = new Book();
        Book book2 = new Book();

        book1.autor = " Mihai Eminescu ";
        book1.titlu = " Poezii ";

        Book book3 = new Book(150," Marile sperante ", " Mark Twain ");

        System.out.println(book1.afiseaza());

        book2.autor = " Ion Creanga ";
        book2.titlu = " Amintiri din copilarie ";
        System.out.println(book2.autor + book2.titlu);
        System.out.println(book2.afiseaza());
        System.out.println(book1.getPret());
        System.out.println(book3.afiseaza());

        //exemple clasa sportivi- innotatori
        Innotator inotator1= new Innotator();
        inotator1.seAntreneaza();
        inotator1.seOdihneste();

        Animal Salbatice = new Animal();
        Animal Domestice = new Animal();



    }

}
