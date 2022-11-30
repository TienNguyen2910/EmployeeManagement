package DesignPattern.Signleton;

public class ClientTest {
    public static void main(String[] args) {
        EagerInitialization eager1 = EagerInitialization.getInstance();
        eager1.setName("LuLy");
        System.out.println(eager1.getName());

        EagerInitialization eager2 = EagerInitialization.getInstance();
        System.out.println(eager2.getName());

        LazyInitialization lazy1 = LazyInitialization.getInstance();
        lazy1.setName("lazy");
        System.out.println("LazyInitialization: "+ lazy1.getName());
        LazyInitialization lazy2 = LazyInitialization.getInstance();
        System.out.println(lazy2.getName());
    }
}
