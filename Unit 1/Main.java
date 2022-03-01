public class Main {
  public static void main(String[] args) {
    // create a human with name: Alex, weight: 65 kg, energy level: 80%, age: 25 years old, height: 170 cm
    Human human1 = new Human("Alex", 65, 80, 25, 170);
    
    // create a second human with name: Eli, weight: 55 kg, energy level: 15%, age: 16 years old, height: 160 cm
    Human human2 = new Human("Eli", 55, 15, 16, 160);

    // print out starting stats for each human
    System.out.println(human1.toString());
    System.out.println();
    System.out.println(human2.toString());
    System.out.println();
    System.out.println("--------------");
    System.out.println();

    // make human1 go on a run and print out modified stats (energy level and weight)
    final int RUN_TIME = 3; // 3 hours (that is a very long time how do you possibly run for that long)
    human1.run(RUN_TIME); // make them go on a run
    System.out.println(human1.getName() + " went on a " + RUN_TIME + " hour long run. They lost some energy and weight.");
    System.out.println("New energy level: " + human1.getEnergyLevel() + "%");
    System.out.println("New weight: " + human1.getWeight() + " kg");
    System.out.println();

    // make human2 have a birthday, they get older by a year
    human2.birthday();
    System.out.println("It's " + human2.getName() + "'s birthday! They're now " + human2.getAge() + ".");
    System.out.println();
    
    // make human2 go to sleep
    final int SLEEP_TIME = 12;
    human2.sleep(SLEEP_TIME);
    System.out.println(human2.getName() + " was really tired. They slept for " + SLEEP_TIME + " hours. They gained some energy.");
    System.out.println("New energy level: " + human2.getEnergyLevel() + "%");
    System.out.println();

    // make human1 get more energy out of nowhere !!
    final int FULL_ENERGY = 100;
    human1.setEnergyLevel(FULL_ENERGY);
    System.out.println(human1.getName() + " magically got all their energy back! They now have " + FULL_ENERGY + "% of their energy.");
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
 * void sleep(int hours) - raises energyLevel by hours * 10% >>> this is so little omg
 * void run(double km) - loses energy using some formula, decreases weight by
 * 0.001 per km
 * String toString() - returns all the attributes of the human in a String
 * ie. "Name: Mr. Lee \nAge: 54 \n....."
 * void main(String[] args)
 * create two humans
 * demonstrate using the accessors/mutators successfully
 * demonstrate using the other methods successfully
 */