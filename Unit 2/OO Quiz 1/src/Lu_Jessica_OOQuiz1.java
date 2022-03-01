public class Lu_Jessica_OOQuiz1 {
    public static void main(String[] args) {
        // creating objects (humans / veggies / cookies!)
        Human human = new Human("Alex", 55, 60);
        Vegetable veg = new Vegetable ("Broccoli", 50, 130);
        Cookie cookie1 = new Cookie();
        Cookie cookie2 = new Cookie("Chocolate", 80, 300);
        Cookie cookie3 = new Cookie("Strawberry", 40, 150, true);

        // person tries to eat packaged cookie
        System.out.println(human.getName() + " tries to eat the " + cookie3.getName() + " cookie.");
        human.eat(cookie3, 10);
        System.out.println();

        // person tries to eat too much of a vegetable
        System.out.println(human.getName() + " tries to eat the " + veg.getName() + ".");
        human.eat(veg, 9000);
        System.out.println();

        // person (successfully) eats a cookie and gains energy
        System.out.println(human.getName() + " eats the " + cookie2.getName() + " cookie.");
        System.out.println("old energy: " + human.getEnergyLevel());
        human.eat(cookie2, 40);
        System.out.println("They now have " + human.getEnergyLevel() + "%."); // broken logic

    }
}

/*
Create 1 humans
Create 1 vegetable
Create 3 cookies (use each of the constructors)
One of the cookies should be packaged
Person should try to eat packaged cookie
Person should try to eat too much of a vegetable
Person should eat a cookie and gain energy
 */