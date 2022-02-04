package billyburgerchallenge;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "White", "Sausage", 3.56);

        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddtion1("Tomato", 0.27);
        hamburger.addHamburgerAddtion2("Onion", 1.33);
        hamburger.addHamburgerAddtion3("Lettuce", 0.75);
        hamburger.addHamburgerAddtion1("Cheese", 1.12);
        System.out.println("Total burger price: " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddtion1("Egg", 5.43);
        healthyBurger.itemizeHamburger();
        healthyBurger.addHamburgerAddtion1("Lentils", 1.32);
        System.out.println("Total is " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();
        deluxeBurger.addHamburgerAddtion1("Should not do this", 50.3);
    }
}