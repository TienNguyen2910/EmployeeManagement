package DesignPattern.Decorator;

public class ThreeCheesePizza implements Pizza {
    private String description = "Mozzarella, Fontina, Parmesan , Cheese Pizza";
    private double cost = 10.00;
    public ThreeCheesePizza(String newDescription){
        description = newDescription;
    }
    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }
}
