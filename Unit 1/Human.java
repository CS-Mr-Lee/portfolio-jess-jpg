public class Human {
  /** attributes */

  /** Name of the human */
  private String name;
  /** Weight of the human in kg */
  private double weight;
  /** Energy level of the human */
  private double energyLevel;
  /** Age of the human */
  private int age;
  /** Height of the human in centimetres */
  private int height;

  /** constructors */

  /**
   * Name: Human
   * Description: Creates a basic human
   * @param name        the name of the human
   * @param weight      the weight of the human in kg
   * @param energyLevel the energy level as a percent value from 0 to 100
   * @param age         the age of the human
   * @param height      the height of the human in cm
   */
  public Human(String name, double weight, double energyLevel, int age, int height) {
    this.name = name;

    if (weight <= 0) { // if weight is negative, weight = 50 kg
      this.weight = 50;
    } else {
      this.weight = weight;
    }

    if (energyLevel > 100) {
      this.energyLevel = 100;
    } else if (energyLevel < 0) {
      this.energyLevel = 0;// if energy level less than 0 then enrgy level = 0
    } else {
      this.energyLevel = energyLevel;
    }

    if (age <= 0) {
      this.age = 1; // if age isn't positive then the person is 1 years old
    } else {
      this.age = age;
    }

    if (height <= 0) {
      this.height = 100; // if height isn't positive then the person is 100 cm tall
    } else {
      this.height = height;
    }
  }

  /** methods */

  // accessors

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

  /**
   * Name: getAge
   * Description: get the age of the human
   * @return the age of the human
   */
  public int getAge() {
    return this.age;
  }

  /**
   * Name: getHeight
   * Description: get the height of the human
   * @return the height of the human
   */
  public int getHeight() {
    return this.height;
  }

  // mutators

  /**
   * Name: setWeight
   * Description: set a new weight in kg
   * @param newWeight the expected new weight in kg
   */
  public void setWeight(double newWeight) {
    if (newWeight > 0) { // if the new weight is positve
      this.weight = newWeight;
    } // if the new weight is neg or zero then the weight does not change
  }

  /**
   * Name: setEnergyLevel
   * Description: set a new energy level, ranged from 0 to 100 inclusive
   * @param newEnergyLevel the expected new energy level
   */
  public void setEnergyLevel(double newEnergyLevel) {
    if (newEnergyLevel < 0) { // if negative energy level, = 0
      this.energyLevel = 0;
    } else if (newEnergyLevel > 100) { // if energy level above 100, energy level = 100
      this.energyLevel = 100;
    } else {
      this.energyLevel = newEnergyLevel;
    }
  }

  /**
   * Name: setHeight
   * Description: set a new height for the human
   * @param newHeight the expected new height of the human in cm
   */
  public void setHeight(int newHeight) {
    if (newHeight > 0) { // if the new height is positive, then that is the height
      this.height = newHeight;
    } // if the height is non-positive then the height stays the same
  }

  /** other methods */

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
   * Name: toString
   * Description: returns all the attributes of the human in a String
   * @return all the attributes of the human
   */
  public String toString() {
    String allAttributes;

    allAttributes = "Name: " + name + "\nWeight: " + weight + " kg\nEnergy Level: " + energyLevel + "%\nAge: " + age + " years old\nHeight: " + height + " cm";

    return allAttributes;
  }

  /**
  Name: birthday
  Description: human gets a year older! (age + 1)
  */
  public void birthday() {
    this.age = age + 1;
  }
  
  
}

/*
 * It will have:
 * 
 * Attributes
 * name
 * weight (in kg)
 * energyLevel (from 0 - 100%)
 * 2 other attributes
 * Constructor
 * Appropriate Access/Mutator Methods
 * Other methods
 * void sleep(int hours) - raises energyLevel by hours * 10%
 * void run(double km) - loses energy using some formula, decreases weight by
 * 0.001 per km
 * String toString() - returns all the attributes of the human in a String
 * ie. "Name: Mr. Lee \nAge: 54 \n....."
 * void main(String[] args)
 * create two humans
 * demonstrate using the accessors/mutators successfully
 * demonstrate using the other methods successfully
 */