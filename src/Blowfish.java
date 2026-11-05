package zoo;

public class Blowfish extends Fish implements AnimalBehavior {
    private boolean poisonous;

    public Blowfish() {
        super();
        this.poisonous = true;
    }

    public Blowfish(String name, int age, double weight, String waterType, boolean poisonous) {
        super(name, age, weight, waterType);
        this.poisonous = poisonous;
    }

    public Blowfish(String name, int age, boolean poisonous) {
        super(name, age, "saltwater");
        this.poisonous = poisonous;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the blowfish crunches snails and crustaceans with its beak-like teeth.");
    }

    @Override
    public String getVoice() {
        return "Soft grinding of teeth";
    }

    public void inflate() {
        System.out.println(getName() + " puffs up like a balloon to scare off predators!"
                + (poisonous ? " (and it is poisonous)" : ""));
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " hovers motionless among the rocks and sleeps.");
    }

    @Override
    public void move() {
        System.out.println("Blowfish swims.");
    }

    public boolean isPoisonous() { return poisonous; }
    public void setPoisonous(boolean poisonous) { this.poisonous = poisonous; }

    @Override
    public String toString() {
        return "Blowfish{name='" + getName() + "', age=" + getAge() + ", weight=" + getWeight()
                + " kg, waterType='" + getWaterType() + "', poisonous=" + poisonous + "}";
    }
}