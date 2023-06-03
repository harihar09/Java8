package Java8.commonFiles;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<String,Integer>();

        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("z",26);
        map.put("e",5);

        map.forEach((key,value)-> System.out.println(key+" "+value));
        map.entrySet().stream().filter(entry ->entry.getKey()=="a").map(entry ->entry.getValue()).forEach(entry -> System.out.println(entry));
        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(e-> System.out.println(e));

    }
}
