package Java.Generic;

public class UseBox {
    public static void main(String[] args) {
        Box box = new Box<Integer>(15);
        System.out.println("Int :"+ box.getValue());

        Box box1 = new Box<String>("Hello. Nice to meet you !!");
        System.out.println("String: "+ box1.getValue());

        Box box2 = new Box(17.8);
        System.out.println("Double: "+box2.getValue());
    }
}
