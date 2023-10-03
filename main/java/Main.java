import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How Many pets do you own");
        int numberOfPets = scanner.nextInt();

        List<Pets> pets = new ArrayList<>();

        for (int i = 0; i < numberOfPets; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("What's your pet type? ");
            String petType = scanner1.next();
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("name of your pet? ");
            String petName = scanner2.next();
            switch (petType.toLowerCase()) {
                case "dog":
                    Dog dog = new Dog(petName, petType);
                    pets.add(dog);
                    break;
                case "cat":
                    Cat cat = new Cat(petName, petType);
                    pets.add(cat);
                    break;
                case "lion":
                    Lion lion = new Lion(petName, petType);
                    pets.add(lion);
                    break;
                default:
                    System.out.println("Pet Unsupported ");
            }

        }
        for (Pets pet : pets) {
            System.out.println(pet.getName());
            System.out.println(pet.getType());
            pet.petSpeak();
        }
    }
}

