public class SchoolApp {
    public static void main(String[] args) {
        Student student1 = new Student("Juan", "Perez", "juanpielguapo@gmail.com","Conocido en Iguala, Gro.");
        Teacher teacher1 = new Teacher("maria", "morales", "mariam@gmail.com", "rufo figueroa");

        System.out.println("El nombre del student1 = " + student1.getName() + " " + student1.getLastName());
        System.out.println("El nombre del Teacher1 = " + teacher1.getName() + " " + teacher1.getLastName());

        student1.setControlNumber(22670104);
        System.out.println("El numero de control de " + student1.getName() + " es: " + student1.getControlNumber());

        //Probando la sobrecarga de metodos

        System.out.println("Metodo toString() de Student: " + student1.toString());
        System.out.println("Metodo toString() de Teacher: " +teacher1.toString());
        System.out.println("El student " + student1.soy());
        System.out.println("El teacher " + teacher1.soy());

    }
}