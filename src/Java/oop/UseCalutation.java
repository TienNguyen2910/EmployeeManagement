package Java.oop;
// inheritance
public class UseCalutation extends Calutation{
    public void multiplication(int a,int b){
        int c = a *b;
        System.out.println("The multiple "+ a +" and "+ b+" is "+ c);
    }

    public static void main(String[] args) {
        UseCalutation demo = new UseCalutation();
        demo.multiplication(2,3);
        demo.subtraction(5,6);
        demo.summation(6,7);
    }
}
