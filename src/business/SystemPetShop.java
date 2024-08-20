package business;

import model.Address;
import model.Animal;
import model.Owner;
import model.Veterinarian;

import java.util.ArrayList;
import java.util.Scanner;

public class SystemPetShop {
    ArrayList<Veterinarian> veterinarians = new ArrayList<Veterinarian>();
    Integer numberOfVeterinarians = 0;

    Scanner sc = new Scanner(System.in);

    public SystemPetShop() {
    }

    public void registerVeterinarian(String name, Float salary) {
        Veterinarian vet = new Veterinarian(name, salary);
        this.veterinarians.add(vet);
        this.numberOfVeterinarians++;
    }

    public ArrayList<Veterinarian> getVeterinarians() {
        return this.veterinarians;
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
    }

    public ArrayList<Animal> getAnimal(int id) { return null}

    public Animal getAnimals() { return null}

    public void registerOwner(Owner owner) {}

    public void registerAddressOwner(Address address) {}

    public Veterinarian choiseVeterinarian() {
        ArrayList<Veterinarian> vets = getVeterinarians();
        for (Veterinarian vet : vets) {
            System.out.println(vets.indexOf(vet) + "Veterinarian: " + vet.getName());
        }
        int index = Integer.parseInt(sc.nextLine());

        return vets.get(index);
    }

    public Address registerAddress() {
        Address address = new Address();
        System.out.println("Enter street address: ");
        address.setStreet(sc.nextLine());
        System.out.println("Enter number address: ");
        address.setNumber(sc.nextInt());
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
}
