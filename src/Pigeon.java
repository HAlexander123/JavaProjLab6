package zoo;

public class Pigeon extends Bird implements AnimalBehavior {
    private String species;

    public Pigeon() {
        super();
        this.species = "Rock pigeon";
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, int age, String species) {
        super(name, age, "grey");
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the pigeon pecks crumbs and grains from the pavement.");
    }

    @Override
    public String getVoice() {
        return "Coo coo";
    }

    public void deliverMessage() {
        System.out.println(getName() + " the " + species + " flies home carrying a message.");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " tucks its head under its wing and sleeps on a ledge.");
    }

    @Override
    public void move() {
        System.out.println("Pigeon flies.");
    }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }

    @Override
    public String toString() {
        return "Pigeon{name='" + getName() + "', age=" + getAge() + ", weight=" + getWeight()
                + " kg, featherColor='" + getFeatherColor() + "', species='" + species + "'}";
    }
}