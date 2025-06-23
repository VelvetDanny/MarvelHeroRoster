public class HeroUtils {

    public static void searchHero(Superhero[] heroes, String target) {
        boolean found = false;
        for (Superhero hero : heroes) {
            if (hero.getName().equalsIgnoreCase(target)) {
                System.out.println("Hero found!");
                hero.displayHero();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Hero not found.");
        }
    }

    public static double calculateAveragePower(Superhero[] heroes) {
        int total = 0;
        for (Superhero hero : heroes) {
            total += hero.getPowerLevel();
        }
        return (double) total / heroes.length;
    }
}
