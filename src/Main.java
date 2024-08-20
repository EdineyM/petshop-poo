import business.SystemPetShop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SystemPetShop petShop = new SystemPetShop();
        int option = -1;

        while (option != 0) {
            SystemPetShop.printMenu();
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 0:
                    break;
                case 1:
                    petShop.registerVeterinarian();
                    break;
                case 2:
                    petShop.getVeterinarians();
                    break;
                case 3:
                    petShop.registerVeterinaryAddress();
                    break;
                case 4:
                    petShop.registerAnimal();
                    break;
                case 5:
                    petShop.getAnimals();
                    break;
                case 6:
                    petShop.registerOwner();
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}