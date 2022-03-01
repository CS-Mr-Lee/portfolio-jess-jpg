/**
 * This program constructs a vegetable that has stats and can be modified
 * -> A name, colour, calorie count, weight, if it's green, if it's edible
 *
 * Course: ICS4U1
 * Date: March 1st, 2022
 * @author Jessica Lu
 */

public class Vegetable {
    /* Attributes */

    /** name of the vegetable */
    private String name;

    /** amount of calories in the vegetable */
    private double calories;

    /** weight of the vegetable (mass) */
    private double weight;

    /* Constructors */

    /**
     * Name: Vegetable
     * Description: creates a basic vegetable
     * @param name name of vegetable
     * @param weight weight of vegetable
     * @param calories number of calories in vegetable
     */
    public Vegetable(String name, double weight, double calories) {
        this.name = name;

        // calories can't be negative
        if (calories < 0) {
            this.calories = 0;
        } else {
            this.calories = calories;
        }

        // weight can't be negative
        if (weight < 0) {
            this.weight = 0;
        } else {
            this.weight = weight;
        }

    }

    /** Methods */

    // accessors (getters)

    /**
     * Name: getName
     * Description: gets the vegetable name
     * @return the vegetable name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Name: getCalories
     * Description: gets the number of calories
     * @return the new calorie amt in the vegetable
     */
    public double getCalories() {
        return this.calories;
    }

    /**
     * Name: getWeight
     * Description: gets the weight of the vegetables
     * @return the new weight of the vegetables
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * Name: eaten
     * Description: vegetable gets eaten, and the same % of calories also gets removed, unless weight eaten is more than what it started with
     * @param weight the weight of how much was eaten
     * @return amount of calories taken from cookie
     */
    public int eaten(double weight) {
        double percentWeight; // percent of how much of the weight is gone from the veg
        int caloriesEaten;

        if (weight > this.weight) { // if weight is more than what the veg starts with
            return -1;
        } else { //
            percentWeight = weight / this.weight; // (decimal value)
            this.weight = this.weight - weight; // new weight

            caloriesEaten = (int) (this.calories * percentWeight); // calorie amt eaten
            this.calories = this.calories - caloriesEaten; // new calories

            return caloriesEaten;
        }
    }

    public String toString() {
        String allAttributes;

        allAttributes = "Name: " + this.name + "\nWeight: " + this.weight + "g\nCalories: " + this.calories;

        return allAttributes;
    }
}
