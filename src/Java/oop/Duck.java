package Java.oop;

public class Duck extends  Animals {
    public Duck(double weight, double height){
        super(weight,height);
    }
    public void move(){
        System.out.println("Ducks can move and swim");
    }
    public String sound(){
        return "capcapcap";
    }
}
