public class Outer_Demo {
    //Inside class
        public class Inner_Demo {
        public void writeOut() {
            System.out.println("This is Inner Class");
        }
    }
    //method-local inner class
    void myMethod(){
            class MethodInner_Demo{
                public void print(){
                    System.out.println("This is Method Inner Class");
                }
            }
        MethodInner_Demo methodinner = new MethodInner_Demo();
            methodinner.print();
    }
}
