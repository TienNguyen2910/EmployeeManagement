package Java.oop;

public class UseAnimal {
    public static void main(String[] args) {
        Duck duck = new Duck(2.5, 100.05);

        duck.move();
        duck.shape();
        System.out.println("The sound of Duck is "+ duck.sound());
    }
}
