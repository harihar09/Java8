package Java8.Iterate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterator2 {
    public static void main(String[] args) {

        Map<Integer,String > map = new HashMap<Integer,String >();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"e");
        System.out.println(map);
        Iterator<Integer> integeriterator = map.keySet().iterator();
        Iterator<String> stringIterator = map.values().iterator();
        Collection<String> values = map.values();
        System.out.println("size "+map.size());
       Iterator<Map.Entry<Integer,String>> iterator =  map.entrySet().iterator();
     /*   while(iterator.hasNext()){
          *//*  int key = iterator.next();
            String val  = stringIterator.next();
            System.out.println("key "+key);
            System.out.println("val "+val);*//*
           // Map.Entry<Integer,String > entry = iterator.next();
          //  System.out.println(entry.getKey()+" "+entry.getValue());

        }*/
        //map.entrySet().stream().forEach(entry-> System.out.println(entry.getKey()+" "+entry.getValue()));
       // map.forEach((key,val)-> System.out.println(key+" "+val));
        //even entries
        map.entrySet().stream().filter(entry ->entry.getKey()%2==0).forEach(entry -> System.out.println(entry.getKey()+" "+entry.getValue()));
    }
}
