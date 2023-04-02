public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, String lastName, String email, String address) {
        super(name, lastName, email, address);
    }

    public String toString(){
        String texto = "la teacher " + getName() + getLastName() +
                "\n, correo electronico "+ getEmail() +
                "\n y dirección " + getAddress();


        return texto;
    }

    public String soy(){
        return "Soy una persona y maestro";
    }

}
