public class Main {
    public static void main(String[] args) {
        Outer_Demo out = new Outer_Demo();
        Outer_Demo.Inner_Demo inner = out.new Inner_Demo();
        System.out.print("Inner Class: ");
        inner.writeOut();
        out.myMethod(); //method inner class
    }
}