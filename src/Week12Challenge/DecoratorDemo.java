package Week12Challenge;

import java.util.Scanner;

public class DecoratorDemo {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your character's name?");
        String cName = keyboard.nextLine();
        GameCharacter character = new Character(cName);

        int choice = 0;
        do {
            decisionMenu();
            choice = Integer.parseInt(keyboard.nextLine());
            switch (choice){
                case 1:
                    System.out.println(character.getName() + " " + character.getMight() + " went Right");
                    break;
                case 2:
                    System.out.println(character.getName() + " " + character.getMight() + " went Left");
                    break;
                default:
                    System.out.println(character.getName() + " " + character.getMight() + " went Straight");
                    break;
            }
            if(choice != 4) {
                    lootMenu();
                    choice = Integer.parseInt(keyboard.nextLine());
                    switch (choice){
                        case 1:
                            character = new Shield(character);
                            System.out.println("You acquired a shield!");
                            System.out.println(character.getName() + " " + character.getMight());
                            break;
                        case 2:
                            character = new Poisoned(character);
                            System.out.println("The chest was Trapped! and you were poisoned");
                            System.out.println(character.getName() + " " + character.getMight());
                            break;
                        default:
                            System.out.println(character.getName() + " " + character.getMight() + " went back");
                            break;
                    }
            }

        } while (choice != 4);


    }

    private static void decisionMenu()  {
            System.out.println("You see two exits, enter a number for the action");
            System.out.println("1. Go Right");
            System.out.println("2. Go Left");
            System.out.println("3. Go straight");
            System.out.println("4. Leave");
                }
                private static void lootMenu() {
                    System.out.println("You see two chests");
                    System.out.println("1. Left Chest");
                    System.out.println("2. Right Chest");
                    System.out.println("3. Go back");
                    System.out.println("4. Leave");
                }
}
