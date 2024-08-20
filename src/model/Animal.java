package model;

public class Animal {
    String name;
    Owner owner;
    String species;
    String description;

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        String animal = "";
        animal += "Name: " + this.name + "\nSpecie: " + this.species + "\nDescription: " + this.description + "\n";
        return animal;
    }
}
