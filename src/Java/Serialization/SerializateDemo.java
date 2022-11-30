package Java.Serialization;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//Nhap data vao file
public class SerializateDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Tien Nguyen";
        e.address = "20 Stress, Hoc Mon District, HCM City";
        e.SSN = 111222333;
        e.number = "0367994345";
        try {
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            System.out.println("Serialized data is saved in employee.ser");
        }catch (IOException i){
            i.printStackTrace();
        }
    }
}
