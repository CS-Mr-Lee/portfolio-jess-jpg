/**
 * This program constructs a human
 * -> A name, weight, energy level, age, and height
 *
 * Course: ICS4U1
 * Date: Mar. 1st, 2022
 * @author Jessica Lu
 */

public class Human {
    /* attributes */

    /** Name of the human */
    private String name;
    /** Weight of the human in kg */
    private double weight;
    /** Energy level of the human */
    private double energyLevel;

    /* constructors */

    /**
     * Name: Human
     * Description: Creates a basic human
     * @param name        the name of the human
     * @param weight      the weight of the human in kg
     * @param energyLevel the energy level as a percent value from 0 to 100
     */
    public Human(String name, double weight, double energyLevel) {
        this.name = name;

        // weight must be positive
        if (weight <= 0) { // if weight is negative, weight = 50 kg
            this.weight = 50;
        } else {
            this.weight = weight;
        }

        // energy level must be a value between 0 and 100 inclusive
        if (energyLevel > 100) {
            this.energyLevel = 100;
        } else if (energyLevel < 0) {
            this.energyLevel = 0;
        } else {
            this.energyLevel = energyLevel;
        }
    }

    /* accessors */

    /**
     * Name: getName
     * Description: get the name of the human
     * @return the name of the human
     */
    public String getName() {
        return this.name;
    }

    /**
     * Name: getWeight
     * Description: get the weight of the human
     * @return the weight of the human
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * Name: getEnergyLevel
     * Description: get the energy level of the human
     * @return the energy level of the human
     */
    public double getEnergyLevel() {
        return this.energyLevel;
    }

    /* other methods */

    /**
     * Name: sleep
     * Description: raises energy level by hours slept * 10%
     *
     * @param hours the number of hours slept
     */
    public void sleep(int hours) {
        final double PERCENT_ENERGY_GAIN_PER_HOUR = 0.1;
        this.energyLevel = energyLevel + hours * PERCENT_ENERGY_GAIN_PER_HOUR;
    }

    /**
     * Name: run
     * Description: loses 3% energy per km run, decreases weight by 0.001 per km run
     *
     * @param km the amount of km run
     */
    public void run(double km) {
        final double PERCENT_ENERGY_LOSS_PER_KM = 3;
        final double WEIGHT_LOSS_PER_KM = 0.001;

        this.energyLevel = energyLevel - PERCENT_ENERGY_LOSS_PER_KM * km;
        this.weight = weight - WEIGHT_LOSS_PER_KM * km;
    }

    /**
     * Name: eat
     * Description: human eats a vegetable!
     * @param veg the vegetable
     * @param grams weight of the vegetable
     */
    public void eat(Vegetable veg, double grams) {
        double weightStart;
        double weightEnd;
        double weightEaten;
        double calEaten;
        double newEnergyPercent;

        if (grams <= veg.getWeight()) { // if grams has same or less weight as starting veg
            weightStart = veg.getWeight();
            calEaten = veg.eaten(grams); // eats the veggie !!
            weightEnd = veg.getWeight();

            // gain weight
            weightEaten = weightStart - weightEnd; // eaten weight
            this.weight = this.weight + weightEaten; // human gains the eaten weight

            // gain energy
            newEnergyPercent = (calEaten / 15); // percent
            this.energyLevel = energyLevel + newEnergyPercent; // new energy level

            // makes sure it cant pass the limit of 100%
            if (energyLevel > 100) {
                this.energyLevel = 100;
            }
        } else {
            System.out.println("I don't have that much food");
        }

    }

    /**
     * Name: eat
     * Description: human eats a cookie!
     * @param food the cookie
     * @param grams the weight of the cookie
     */
    public void eat(Cookie food, double grams) {
        double weightStart;
        double weightEnd;
        double weightEaten;
        double calEaten;
        double newEnergyPercent;

        if (food.getIsPackaged()) { // if food is packaged
            System.out.println("I can't eat the bag");
        } else if (grams > food.getWeight()) { // if weight is greater than how much the cookie weighs
            System.out.println("I don't have that much food");
        } else {
            weightStart = food.getWeight();
            calEaten = food.eaten(grams); // eats the veggie !!
            weightEnd = food.getWeight();

            // gain weight
            weightEaten = weightStart - weightEnd; // eaten weight
            this.weight = this.weight + weightEaten; // human gains the eaten weight

            // gain energy
            newEnergyPercent = (calEaten / 15); // to decimal value

            this.energyLevel = energyLevel + newEnergyPercent; // new energy level

            // makes sure it cant pass the limit of 100%
            if (energyLevel > 100) {
                this.energyLevel = 100;
            }
        }
    }

    /**
     * Name: toString
     * Description: returns all the attributes of the human in a String
     * @return all the attributes of the human
     */
    public String toString() {
        String allAttributes;

        allAttributes = "Name: " + name + "\nWeight: " + weight + " kg\nEnergy Level: " + energyLevel + "%";

        return allAttributes;
    }
}
