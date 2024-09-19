package sample;

public class Maain {

    public static void main(String[] args) {
       
        Cat cat = new Cat("Fish", "White", 4, "Whiskers");
        Dog dog = new Dog("Meat", "Brown", 10, "Rex");

       
        System.out.println(cat);
        System.out.println(dog);

       
        Veterinarian vet = new Veterinarian("Dr. Smith");

       
        vet.treatment(cat);
        vet.treatment(dog);
    }
}
