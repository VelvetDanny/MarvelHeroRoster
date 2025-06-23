// SuperheroRoster.java
public class SuperheroRoster {

    public static void main(String[] args) {
        // Create an array of Superhero objects
        Superhero[] heroes = {
            new Superhero("Spider-Man", "Web-slinging", 85),
            new Superhero("Iron Man", "Flying and high-tech armor", 90),
            new Superhero("Black Widow", "Stealth and combat", 80)
        };

        // Display hero details
        System.out.println("=== Hero Details ===");
        for (Superhero hero : heroes) {
            hero.displayHero();
        }

        // Search for a hero
        System.out.println("=== Search for Hero ===");
        HeroUtils.searchHero(heroes, "Iron Man");

        // Calculate and display average power
        double avg = HeroUtils.calculateAveragePower(heroes);
        System.out.println("Average Power Level: " + avg);
    }
}
