package business;

import model.Address;
import model.Animal;
import model.Owner;
import model.Veterinarian;

import java.util.ArrayList;
import java.util.Scanner;

public class SystemPetShop {
    ArrayList<Veterinarian> veterinarians = new ArrayList<Veterinarian>();
    ArrayList<Animal> animals = new ArrayList<>();
    Integer numberOfVeterinarians = 0;

    Scanner sc = new Scanner(System.in);

    public SystemPetShop() {
    }

    public void registerVeterinarian() {
        Veterinarian vet = new Veterinarian();
        System.out.println("Enter the name of the veterinarian: ");
        vet.setName(sc.nextLine());
        System.out.println("Enter the salary of the veterinarian: ");
        vet.setSalary(Float.parseFloat(sc.nextLine()));
        this.veterinarians.add(vet);
        this.numberOfVeterinarians++;
    }

    public void getVeterinarians() {
        for (Veterinarian vet : veterinarians) {
            System.out.println(vet.toString());
        }
    }

    public void registerVeterinaryAddress() {
        Veterinarian vet = choiseVeterinarian();

        Address address = registerAddress();

        vet.setAddress(address);
    }

    public void registerAnimal() {
        Veterinarian vet = choiseVeterinarian();

        Animal animal = new Animal();
        System.out.println("Enter the name of the animal: ");
        animal.setName(sc.nextLine());
        System.out.println("Enter the specie of the animal: ");
        animal.setSpecies(sc.nextLine());
        System.out.println("Enter the description of the animal: ");
        animal.setDescription(sc.nextLine());

        vet.setAnimal(animal);
        this.animals.add(animal);
    }

    public void getAnimals() {
        Veterinarian vet = choiseVeterinarian();

        ArrayList<Animal> animals = vet.getAnimal();
        for (Animal animal : animals) {
            System.out.println(animals.indexOf(animal) + " - Animal: " + animal.getName());
        }
    }

    public void registerOwner() {
        for (Animal animal : animals) {
            System.out.println(animals.indexOf(animal) + " - Animal: " + animal.getName());
        }
        int index = Integer.parseInt(sc.nextLine());

        Owner owner = new Owner();
        System.out.println("Enter the name of the owner: ");
        owner.setName(sc.nextLine());
        System.out.println("Enter the cpf of the owner: ");
        owner.setCpf(sc.nextLine());

        animals.get(index).setOwner(owner);
    }

    public void registerAddressOwner() {
        for (Animal animal : animals) {
            if (animal.getOwner() != null) {
                System.out.println(animals.indexOf(animal) + " - Animal: " + animal.getName());
            }
        }
        int index = Integer.parseInt(sc.nextLine());
        Owner owner = animals.get(index).getOwner();

        System.out.println("Owner: " + owner.getName() + " - CPF: " + owner.getCpf());
        owner.setAddress(registerAddress());
    }

    public Veterinarian choiseVeterinarian() {
        System.out.println("Select a veterinarian: ");
        for (Veterinarian vet : veterinarians) {
            System.out.println(veterinarians.indexOf(vet) + " - Veterinarian: " + vet.getName());
        }
        int index = Integer.parseInt(sc.nextLine());

        return veterinarians.get(index);
    }

    public Address registerAddress() {
        Address address = new Address();
        System.out.println("Enter street address: ");
        address.setStreet(sc.nextLine());
        System.out.println("Enter number address: ");
        address.setNumber(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter neighborhood address: ");
        address.setNeighborhood(sc.nextLine());
        System.out.println("Enter city address: ");
        address.setCity(sc.nextLine());
        System.out.println("Enter state address: ");
        address.setState(sc.nextLine());
        System.out.println("Enter postal code: ");
        address.setZip(sc.nextLine());

        return address;
    }

    public static void printMenu() {
        System.out.println("Choose an option:");
        System.out.println("0. Exit");
        System.out.println("1. Register Veterinarian");
        System.out.println("2. Show Veterinarians");
        System.out.println("3. Register Address of Veterinarian");
        System.out.println("4. Register Animal");
        System.out.println("5. Show Animals");
        System.out.println("6. Register Owner");
    }
}
