package model;

import java.util.ArrayList;

public class Veterinarian {
    String name;
    Float salary;
    Address address;
    ArrayList<Animal> animal = new ArrayList<Animal>();
    Integer numberAnimal = 0;

    public Veterinarian() {
    }

    public Veterinarian(String name, Float salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<Animal> getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        if (this.numberAnimal <= 30) {
            this.animal.add(animal);
            this.numberAnimal++;
        }
    }

    public Integer getNumberAnimal() {
        return numberAnimal;
    }

    public void setNumberAnimal(Integer numberAnimal) {
        this.numberAnimal = numberAnimal;
    }

    @Override
    public String toString() {
        String veterinarian = "";
        veterinarian += "Name: " + name + "\n";
        veterinarian += "Salary: " + salary + "\n";
        if (this.address != null) {
            veterinarian += "Address: " + address.toString() + "\n";
        }
        return veterinarian;
    }
}
