/**
 * This program constructs a cookie that has stats and can be modified
 * -> A name, weight, calorie count and if it's packaged
 *
 * Course: ICS4U1
 * Date: March 1st, 2022
 * @author Jessica Lu
 */

public class Cookie {
    /* attributes */

    /** name of the cookie */
    private String name;

    /** weight of the cookie in grams */
    private double weight;

    /** number of calories in the cookie*/
    private int calories;

    /** whether the cookie is packaged or not */
    private boolean isPackaged;

    /* constructors */
    /**
     * Name: Cookie
     * Description: creates a basic "empty" cookie
     */
    public Cookie() {
        this.name = "";
        this.weight = -1;
        this.calories = -1;
        this.isPackaged = false;
    }

    /**
     * Name: Cookie
     * Description: creates a cookie with given stats
     * @param name the name of the cookie
     * @param weight the weight of the cookie in grams
     * @param calories the calories in the cookie
     */
    public Cookie(String name, double weight, int calories) {
        this.name = name;
        this.isPackaged = false; // packaging is always false to start off with

        // sets weight, makes sure it isn't negative
        if (weight < 0) {
            this.weight = 0;
        } else {
            this.weight = weight;
        }

        // sets calories, makes sure it isn't negative (idk if you can have neg calories?)
        if (calories < 0) {
            this.calories = 0;
        } else {
            this.calories = calories;
        }
    }

    /**
     * Name: Cookie
     * Description: creates a cookie with given stats
     * @param name the name of the cookie
     * @param weight the weight of the cookie in grams
     * @param calories the calories in the cookie
     * @param isPackaged whether the cookie is packaged or not
     */
    public Cookie(String name, double weight, int calories, boolean isPackaged) {
        this.name = name;
        this.isPackaged = isPackaged;

        // sets weight, makes sure it isn't negative
        if (weight < 0) {
            this.weight = 0;
        } else {
            this.weight = weight;
        }

        // sets calories, makes sure it isn't negative (idk if you can have neg calories?)
        if (calories < 0) {
            this.calories = 0;
        } else {
            this.calories = calories;
        }
    }

    /* accessors */

    /**
     * Name: getName
     * Description: get the name of the vegetable
     * @return name of the vegetable
     */
    public String getName() {
        return this.name;
    }

    /**
     * Name: getWeight
     * Description: get the weight of the vegetable in grams
     * @return weight of the vegetable in grams
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * Name: getCalories
     * Description: get the calorie count of the vegetable
     * @return calorie count of the vegetable
     */
    public int getCalories() {
        return this.calories;
    }

    /**
     * Name: getIsPackaged
     * Description: get if the cookie is packaged or not
     * @return whether the cookie is packaged or not
     */
    public boolean getIsPackaged() {
        return this.isPackaged;
    }

    /* other methods */

    /**
     * Name: open
     * Description: opens / unpackages the cookie, if the cookie has packaging
     */
    public void open() {
        if (this.isPackaged = true) {
            this.isPackaged = false;
        }
    }

    /**
     * Name: eaten
     * Description: cookie gets eaten, if not packaged. some weight gets removed and the same % of calories also gets removed, unless weight eaten is more than what it started with
     * @param weight the weight of how much was eaten
     * @return amount of calories taken from cookie
     */
    public int eaten(double weight) {
        double percentWeight; // percent of how much of the weight is gone from the cookie
        int caloriesEaten;

        if (weight > this.weight) { // if weight is more than what the cookie starts with
            return -1;
        } else if (!(this.isPackaged)) { // only if it is unpackaged
            percentWeight = weight / this.weight;
            this.weight = this.weight - weight; // new weight

            caloriesEaten = (int)(this.calories * percentWeight); // calorie amt eaten
            this.calories = this.calories - caloriesEaten; // new calories

            return caloriesEaten;
        } else {
            return -2;
        }
    }

    /**
     * Name: toString
     * Description: returns the important data of the cookie
     * @return the important data of cookie
     */
    public String toString() {
        String allAttributes;

        allAttributes = "Name: " + this.name + "\nWeight: " + this.weight + "g\nCalories: " + this.calories + "\nPackaged: " + this.isPackaged;

        return allAttributes;
    }

}

