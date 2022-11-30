package Java.oop;

public abstract class Animals {
    private double weight;
    private double height;
    public Animals(double weight, double height){
        this.weight = weight;
        this.height = height;
    }
    public void shape(){
        System.out.println("Weight: "+ this.weight +", Height: "+ this.height);
    }
    public void move(){
        System.out.println("Animals can move");
    }
    public abstract String sound();
}
