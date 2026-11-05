package zoo;

public abstract class Mammal extends Animal {
    private String furColor;

    public Mammal() {
        super();
        this.furColor = "unknown";
    }

    public Mammal(String name, int age, double weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    public Mammal(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the mammal eats food and drinks water.");
    }

    @Override
    public String getVoice() {
        return "Some mammal sound";
    }

    public void nurseYoung() {
        System.out.println(getName() + " feeds its young with milk.");
    }

    public String getFurColor() { return furColor; }
    public void setFurColor(String furColor) { this.furColor = furColor; }

    @Override
    public String toString() {
        return "Mammal{name='" + getName() + "', age=" + getAge() + ", weight=" + getWeight()
                + " kg, furColor='" + furColor + "'}";
    }
}