import java.util.Scanner;

public class ForestQuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Mysterious Forest Adventure!");
        System.out.println("You stand before a dark forest. Do you want to enter? (yes/no)");

        String choice1 = scanner.nextLine();

        if (choice1.equals("yes")) {
            System.out.println("The forest is spooky. You hear a noise. Do you investigate? (yes/no)");

            String choice2 = scanner.nextLine();

            if (choice2.equals("yes")) {
                System.out.println("You find a mysterious glowing object. Do you pick it up? (yes/no)");

                String choice3 = scanner.nextLine();

                if (choice3.equals("yes")) {
                    System.out.println("The object grants you magical powers! You become the forest's guardian.");
                    System.out.println("=== ENDING 1: Magical Guardian ===");
                } else {
                    System.out.println("You leave the object alone and walk away safely.");
                    System.out.println("=== ENDING 2: Safe Escape ===");
                }

            } else {
                System.out.println("You ignore the noise, but get lost in the forest and find your way out only at night.");
                System.out.println("=== ENDING 2: Safe Escape ===");
            }

        } else if (choice1.equals("no")) {
            System.out.println("You decide not to enter the forest. You head home peacefully.");
            System.out.println("=== ENDING 3: Peaceful Homecoming ===");
        } else {
            System.out.println("You hesitate too long and the adventure passes you by.");
            System.out.println("=== ENDING 3: Peaceful Homecoming ===");
        }

        scanner.close();
    }
}

