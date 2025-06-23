public class Superhero {
    private String name;
    private String ability;
    private int powerLevel;

    public Superhero(String name, String ability, int powerLevel) {
        this.name = name;
        this.ability = ability;
        this.powerLevel = powerLevel;
    }

    public String getName() {
        return name;
    }

    public String getAbility() {
        return ability;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void displayHero() {
        System.out.println("Name: " + name);
        System.out.println("Ability: " + ability);
        System.out.println("Power Level: " + powerLevel);
        System.out.println("-------------------------");
    }
}
