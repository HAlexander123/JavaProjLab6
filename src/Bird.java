package zoo;

public abstract class Bird extends Animal {
    private String featherColor;

    public Bird() {
        super();
        this.featherColor = "unknown";
    }

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name, int age, String featherColor) {
        super(name, age);
        this.featherColor = featherColor;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the bird pecks at seeds and insects.");
    }

    @Override
    public String getVoice() {
        return "Tweet tweet";
    }

    public void fly() {
        System.out.println(getName() + " flaps its " + featherColor + " wings and takes off.");
    }

    public String getFeatherColor() { return featherColor; }
    public void setFeatherColor(String featherColor) { this.featherColor = featherColor; }

    @Override
    public String toString() {
        return "Bird{name='" + getName() + "', age=" + getAge() + ", weight=" + getWeight()
                + " kg, featherColor='" + featherColor + "'}";
    }
}