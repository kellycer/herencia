package AbstractAnimal;
    public class Dog extends Animal {
        public Dog() {

        }

        public Dog(String name, String color, int age) {
            super(name, color, age);
        }

        @Override
        public String talk() {
            return "guau guau";
        }

        public String toString() {
            return super.name + " es un perro " +
                    " de color " + super.color +
                    " de edad en años " + super.age +
                    " y dice " + this.talk();
        }
    }
