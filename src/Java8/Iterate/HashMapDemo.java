package Java8.Iterate;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter key");
        String key = sc.next();
        new HashMapDemo().getNoteInfo(key);
    }
    private void  getNoteInfo(String key){
        Map<String,String > map = new HashMap<String,String >();
        map.put("1","ONE");
        map.put("2","TWO");
        map.put("3","THREE");
        map.put("4","FOUR");
        map.put("5","FIVE");

      /*  for(Map.Entry<String,String> entry : map.entrySet()){
            if(entry.getKey().equals(key)){
                System.out.println("entry value "+entry.getValue());
            }
        }*/
        String s = map.entrySet().stream().filter(entry -> entry.getKey().equals(key))
                .map(entry -> entry.getValue()).findAny().get();
        System.out.println("value "+s);

    }
}
