public class Human {
    private String email;
    private String address;

    public static String planeta;

    public Human(String email, String address) {
        this.email = email;
        this.address = address;
    }

    public String getEmail(){
        return this.email;
    }

    public String getAddress(){
        return this.address;
    }


    public void verify(){
        System.out.println("Verifies email");
    }
    public void sendEmail(){
        System.out.println("Sends email");
    }
}
