import java.util.Scanner;

// tinh luy thua a^n
public class Demo {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int a = sc.nextInt();
       int result = 1;
//       for(int i : n){
//
//       }

       for (int i = 0; i<n; i++){
           result *= a;
           System.out.println("ket qua tu lan lap: "+ result);
       }
       System.out.println("Ket qua cuoi cung: "+ result);
   }
}
