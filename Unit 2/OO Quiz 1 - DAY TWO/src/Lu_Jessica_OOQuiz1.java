public class Lu_Jessica_OOQuiz1 {
    public static void main(String[] args) {
        // creating objects (humans / veggies / cookies!)
        Human human = new Human("Alex", 55, 60);
        Vegetable veg = new Vegetable ("Broccoli", 50, 130);
        Cookie cookie1 = new Cookie();
        Cookie cookie2 = new Cookie("Vanilla", 100, 300);
        Cookie cookie3 = new Cookie("Strawberry Shortcake", 40, 150, true);

        // person tries to eat packaged cookie
        System.out.println(human.getName() + " tries to eat the " + cookie3.getName() + " cookie.");
        human.eat(cookie3, 10);
        System.out.println();

        // person tries to eat too much of a vegetable
        System.out.println(human.getName() + " tries to eat the " + veg.getName() + ".");
        human.eat(veg, 9000); // 9000 grams > 50 grams, which is how much veg weighs
        System.out.println();

        // person (successfully) eats a cookie and gains energy (output the old vs. new energy level)
        System.out.println(human.getName() + " eats the " + cookie2.getName() + " cookie.");
        System.out.println("Before eating the cookie they had a "+ human.getEnergyLevel() + "% energy level.");
        human.eat(cookie2, 50);
        System.out.println("Their new energy level is: " + human.getEnergyLevel() + "%.");
    }
}