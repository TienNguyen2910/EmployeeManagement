package Java.collection_hashset;

import java.util.HashMap;
import java.util.Scanner;

//input: abcbd
//out: a:1, b: 2, c: 1, d:1
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        HashMap<Character, Integer> map = new HashMap<>();
        System.out.println("Nhap tu ban phim vao 1 chuoi: ");
        str = sc.nextLine();
        char[] ch = str.toCharArray();
        System.out.println("Output:");

        // abc  bcda
        for (int i =0 ;i< ch.length-1; i++){
            int count =1;
            for(int j=i+1; j< ch.length; j++)
                if(ch[i] == ch[j])
                    count++;
            if(map.containsKey(ch[i]))
                continue;
            map.put(ch[i],count);
        }
        System.out.println(map);
    }
}
