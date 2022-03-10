/**
 * This is a dog class
 *
 * Class: ICS4U1
 * Date: March 03 2022
 * @author James Wong
 * @author Jessica Lu
 */

public class Dog extends Animal {

    /*
    Attributes
    */

    /* Is the dog Hypoallergenic or not */
    private boolean isHypoallergenic;

  /*
  Constructor
  */

    /**
     Name: Dog
     Description: creates a basic dog
     @param name the name of the dog
     @param colour the colour of the dog
     @param age the age of the dog
     @param weight the weight of the dog in kg
     @param energyLevel the energy level of the dog 0-100
     @param isTired whether the dog is tired or not
     @param isHypoallergenic whether the dog is hypoallergenic or not
     */
    public Dog(String name, String breed, String colour, int age, double weight, int energyLevel, boolean isTired, boolean isHypoallergenic, boolean isColdBlooded) {

        // calling from the super class
        super(name, breed, colour, age, weight, energyLevel, isTired, isColdBlooded);

        // declaring isHypoallergenic
        this.isHypoallergenic = isHypoallergenic;
    }

  /*
  Method
  */

    /**
     Name: getHypoallergenic
     Description: return whether the dog is hypoallergenic or not
     */
    public boolean getIsHypoallergenic() {return this.isHypoallergenic;}

  /*
  Mutators
  */

    /**
     Name: play
     Description: Dog plays and loses weight and energy
     @param time the minutes the dog spent playing
     */
    public void play(int time) {

        if (getIsTired()) {        // if the dog is tired, the dog won't have enough energy to play
            System.out.println(getName() + " is too tired to play");
        } else {            // if the dog has enough energy, the dog can play

            setWeight(getWeight() - time / 10);         // the dog gains weight of the time divide by 10

            setEnergyLevel(getEnergyLevel() - (int) (0.01 * (time / 10)) * getEnergyLevel());    // the dog's energy level is the time divided by 10 as a percentage of the original energy level subtracted from the enegy level

            // keep the energy level within 0-100
            if (getEnergyLevel() > 100) {          // if the energy level is greater than 100
                setEnergyLevel(100);
            } else if (getEnergyLevel() < 0) {    // if the energy level is less than 0
                setEnergyLevel(0);
            }

            // if the dog plays for over 100 minutes, then the dog will be tired
            if (time > 100) {
                setIsTired(true);
            } else {
                setIsTired(false);    // if the dog plays for less than 100 minutes, then the dog will not be tired
            }
            System.out.println(getName() + " is not tired to play and has a play time of " + time + " minutes");
            System.out.println(getName() + " has a new energy level of " + getEnergyLevel() + "% has a new weight of " + getWeight() + "kg");
        }
    }

    public void eat(double grams){

        setWeight(getWeight() + grams / 10);          // the dog's weight is the grams plus 10 added to the original weight

        this.energyLevel = this.energyLevel + (int) (0.01 * (grams / 10)) * this.energyLevel;    // the energy level is the grams divide by 10 as a percentabge of the original energy level added to the energy level

        // keep the energy level within 0-100
        if (this.energyLevel > 100) {          // if the energy level is greater than 100
            this.energyLevel = 100;
        } else if (this.energyLevel < 0) {    // if the energy level is less than 0
            this.energyLevel = 0;
        }

        System.out.println(this.name + " ate food which weighted " + grams + "kg");
        System.out.println(this.name + " has a new energy level of " + this.energyLevel + "% and has a new weight of " + this.weight + "kg");
    }

    /**
     Name: sleep
     Description: Dog sleeps and gains energy
     @param sleep the minutes the dog spent sleeping
     */
    public void sleep ( int sleep) {
        if (isTired) {
            if (sleep > 60) {
                this.isTired = false;

                this.energyLevel = 100;

                System.out.println(this.name + "fell asleep and woke up with a replenishing energy level of 100%");

            } else if (sleep < 60 && sleep > 0) {
                this.energyLevel = this.energyLevel + 25;
                // keep the energy level within 0-100
                if (this.energyLevel > 100) {          // if the energy level is greater than 100
                    this.energyLevel = 100;
                } else {                      // all other cases is if energy level is less than 0
                    this.energyLevel = 0;
                }
                System.out.println(this.name + " fell asleep and woke up with a new energy level of " + this.energyLevel);
            }
        } else {
            System.out.println(this.name + " is not tired enough to sleep");
        }

    }
    /**
     Name: birthday
     Description: the dog gets one year older!
     */
    public void birthday() {
        this.age = this.age + 1;
        System.out.println("It's " + this.name + "'s birthday! " + this.name + " is now " + this.age + " years old.");
    }

    /**
     Name: toString
     Description: returns all dog attributes
     @return all turtle attributes
     */
    public String toString() {

        // String name, String colour, int age, double weight, int energyLevel, boolean isTired, boolean isHypoallergenic
        return "Name: " + this.name + "\nColour: " + this.colour + "\nAge: " + this.age + "\nWeight: " + this.weight + "kg\nEnergy Level: " + this.energyLevel + "%\nIs tired: " + this.isTired + "\nIs Hypoallergenic: " + this.isHypoallergenic;
    }
}