/**
 * This is an animal superclass
 *
 * Class: ICS4U1
 * Date: March 07 2022
 * @author James Wong
 * @author Jessica Lu
 */
public class Animal {
    /* attributes */

    /** The name of the animal */
    private String name;
    /** The breed of the animal */
    private String breed;
    /** The colour of the animal */
    private String colour;
    /** The age of the animal */
    private int age;
    /** The weight of the animal */
    private double weight;
    /** The energy level of the animal */
    private int energyLevel;
    /** Whether the animal tired or not */
    private boolean isTired;
    /** Whether the animal is cold blooded or not */
    private boolean isColdBlooded;

    /* constructors */

    public Animal(String name, String breed, String colour, int age, double weight, int energyLevel, boolean isTired, boolean isColdBlooded){
        this.name = name;
        this.breed = breed;
        this.colour = colour;
        this.isTired = isTired;
        this.isColdBlooded = isColdBlooded;

        // age must be positive
        if (age < 1) {
            this.age = 1;
        } else {
            this.age = age;
        }

        // energy level must be between 0 and 100 inclusive
        if (energyLevel < 0) {
            this.energyLevel = 0;
        } else if (energyLevel > 100) {
            this.energyLevel = 100;
        } else {
            this.energyLevel = energyLevel;
        }

        // weight must be positive. if not, defaults to 150kg
        if (weight < 0) {
            this.weight = 150;
        } else {
            this.weight = weight;
        }
    }

    /* accessors */

    /**
     Name: getName
     Description: return the animal name
     @return the name of the animal
     */
    public String getName() {
        return this.name;
    }

    /**
     Name: getBreed
     Description: return the turtle breed
     @return the breed of the turtle
     */
    public String getBreed() {
        return this.breed;
    }

    /**
     Name: getColour
     Description: return the animal colour
     @return the colour of the animal
     */
    public String getColour() {
        return this.colour;
    }

    /**
     Name: getAge
     Description: return the animal age
     @return the age of the animal
     */
    public int getAge() {
        return this.age;
    }

    /**
     Name: getWeight
     Description: return the animal weight in kg
     @return the weight of the animal in kg
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     Name: getEnergyLevel
     Description: returns the animal's energy level
     @return the energy level in %
     */
    public int getEnergyLevel () {
        return this.energyLevel;
    }

    /**
     Name: getIsTired
     Description: return whether the animal is tired or not
     @return whether the animal is tired or not
     */
    public boolean getIsTired() {
        return this.isTired;
    }

    /**
     Name: getIsColdBlooded
     Description: return whether the animal is cold blooded or not
     @return whether the animal is cold blooded or not
     */
    public boolean getIsColdBlooded() {
        return this.isColdBlooded;
    }

    /* mutators */

    /**
     Name: setAge
     Description: set a new animal age
     @param newAge new possible age
     */
    public void setAge(int newAge) {
        if (newAge <= 0) {
            this.age = 1;
        } else {
            this.age = newAge;
        }
    }

    /**
     Name: setWeight
     Description: set a new weight
     @param newWeight new possible weight
     */
    public void setWeight(double newWeight) {
        if (newWeight > 0) {
            this.weight = newWeight;
        } else {
            this.weight = 0;     // all other cases are negative weights
        }
    }

    /**
     Name: setEnergyLevel
     Description: set a new energy level
     @param newEnergyLevel new possible energy level
     */
    public void setEnergyLevel(double newEnergyLevel) {
        if (newEnergyLevel < 0) {
            this.energyLevel = 0;
        } else if (newEnergyLevel > 100) {
            this.energyLevel = 100;
        } else {
            this.energyLevel = energyLevel;
        }
    }

    /**
     Name: setIsTired
     Description: set if the animal is tired or not
     @param newIsTired if the animal is tired or not
     */
    public void setIsTired(boolean newIsTired) {
        this.isTired = newIsTired;
    }

    /* other methods */

    // still needs eat and sleep
  
    /**
     Name: birthday
     Description: the turtle gets one year older!
     */
    public void birthday() {
        this.age = this.age + 1;
        System.out.println("It's " + this.name + "'s birthday! They are now " + this.age + " years old.");
    }

    /**
     Name: toString
     Description: returns all animal attributes
     @return animal attributes
     */
    public String toString() {
        String attributes;

        // String name, String breed, String colour, int age, int energyLevel, double weight, boolean isTired
        attributes = "Name: " + this.name + "\nBreed: " + this.breed + "\nColour: " + this.colour + "\nAge: " + this.age + "\nEnergy Level: " + this.energyLevel + "%\nWeight: " + this.weight + " kg\nIs tired: " + this.isTired;

        return attributes;
    }

}