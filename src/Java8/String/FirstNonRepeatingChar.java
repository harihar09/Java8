package Java8.String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.next();

        Map<Character,Integer> map = new LinkedHashMap<>();
        for(Character ch : s.toCharArray()){
            map.put(ch,(map.containsKey(ch))?(map.get(ch)+1):1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.print(entry+" ");
        }
        Character key = map.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst().get().getKey();

        System.out.println("non repeating character is "+key);

    }
}
