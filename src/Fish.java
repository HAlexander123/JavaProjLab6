package zoo;

public abstract class Fish extends Animal {
    private String waterType;

    public Fish() {
        super();
        this.waterType = "unknown";
    }

    public Fish(String name, int age, double weight, String waterType) {
        super(name, age, weight);
        this.waterType = waterType;
    }

    public Fish(String name, int age, String waterType) {
        super(name, age);
        this.waterType = waterType;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the fish eats plankton and small organisms.");
    }

    @Override
    public String getVoice() {
        return "Blub blub (fish are almost silent)";
    }

    public void swim() {
        System.out.println(getName() + " swims through the " + waterType + " water.");
    }

    public String getWaterType() { return waterType; }
    public void setWaterType(String waterType) { this.waterType = waterType; }

    @Override
    public String toString() {
        return "Fish{name='" + getName() + "', age=" + getAge() + ", weight=" + getWeight()
                + " kg, waterType='" + waterType + "'}";
    }
}