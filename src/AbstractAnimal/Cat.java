package AbstractAnimal;

public class Cat extends Animal {
    public Cat(){

    }
    public Cat(String name, String color, int age){
        super (name, color, age);
    }
    @Override
    public String talk(){
        return "miauuuu";
    }
    public String toString(){
        return super.name + " es un gato " +
                " de color " + super.color +
                " de edad en años " + super.age +
                " y dice " + this.talk();
    }
}
