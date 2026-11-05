package zoo;

public class Dog extends Mammal implements AnimalBehavior {
    private String breed;

    public Dog() {
        super();
        this.breed = "mixed";
    }

    public Dog(String name, int age, double weight, String furColor, String breed) {
        super(name, age, weight, furColor);
        this.breed = breed;
    }

    public Dog(String name, int age, String breed) {
        super(name, age, "unknown");
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the " + breed + " gobbles up dog food and gnaws a bone.");
    }

    @Override
    public String getVoice() {
        return "Woof woof!";
    }

    public void fetch() {
        System.out.println(getName() + " runs after the ball and brings it back.");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " curls up in its basket and sleeps.");
    }

    @Override
    public void move() {
        System.out.println("Dog runs.");
    }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    @Override
    public String toString() {
        return "Dog{name='" + getName() + "', age=" + getAge() + ", weight=" + getWeight()
                + " kg, furColor='" + getFurColor() + "', breed='" + breed + "'}";
    }
}