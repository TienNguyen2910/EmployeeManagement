package Java.Serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public String number;

    public void mailCheck(){
        System.out.println("Mailing a check to "+ name +" "+ address);
    }
}
