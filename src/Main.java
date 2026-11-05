package zoo;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];

        animals[0] = new Dog();
        animals[1] = new Dog("Rex", 5, 28.5, "brown", "German Shepherd");
        animals[2] = new Pigeon("Kuba", 1, "City pigeon");
        animals[3] = new Pigeon("Gucio", 2, 0.35, "white", "Homing pigeon");
        animals[4] = new Blowfish();
        animals[5] = new Blowfish("Puffy", 3, true);

        for (int i = 0; i < animals.length; i++) {
            System.out.println("[" + i + "] " + animals[i]);
            animals[i].eat();
            System.out.println("Voice: " + animals[i].getVoice());
            System.out.println();
        }

        ((Dog) animals[1]).fetch();
        ((Dog) animals[1]).nurseYoung();
        ((Pigeon) animals[3]).deliverMessage();
        ((Pigeon) animals[3]).fly();
        ((Blowfish) animals[5]).inflate();
        ((Blowfish) animals[5]).swim();

        System.out.println();

        System.out.println("--- AnimalBehavior ---");
        AnimalBehavior[] behaviors = new AnimalBehavior[3];
        behaviors[0] = new Dog("Burek", 3, "Labrador");
        behaviors[1] = new Pigeon("Kuba", 1, "City pigeon");
        behaviors[2] = new Blowfish("Puffy", 3, true);

        behaviors[0].sleep();
        behaviors[1].sleep();
        behaviors[2].sleep();

        System.out.println();

        System.out.println("--- AnimalMove ---");
        for (Animal a : animals) {
            a.move();
        }

        System.out.println();

        System.out.println("--- AnimalName ---");
        for (Animal a : animals) {
            AnimalName.name(a.getName());
        }
    }
}