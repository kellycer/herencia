package AbstractAnimal;

public class PetStore {
    public static void main(String[] args) {

        Cat garfield = new Cat("garfield", "naranja", 5);
        Cat felix = new Cat("felix", "gris", 3);
        Dog firulais = new Dog ("firulais", "negro", 3);
        Rooster Claudio = new Rooster ("Claudio", "negro con blanco", 1);
        System.out.println(" ejemplo de polimorfismo usando clase abstracta\n");

        System.out.println("invcando al metodo toString: \n");
        System.out.println(garfield.toString());
        System.out.println(felix.toString());
        System.out.println(firulais.toString());
        System.out.println(Claudio.toString());



    }

}
