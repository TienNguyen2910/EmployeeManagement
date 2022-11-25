package Java.oop;

public class UseAnimal {
    public static void main(String[] args) {
        Duck duck = new Duck();

        duck.move();
        System.out.println("The sound of Duck is "+ duck.sound());
    }
}
