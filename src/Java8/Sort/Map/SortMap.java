package Java8.Sort.Map;

import Java8.EmployeeApp.Employee;

import java.util.*;

public class SortMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("five",5);
        map.put("two",2);
        map.put("three",3);
        map.put("one",1);
        map.put("four",4);
        System.out.println(map);
        //convert map to list
        List<Map.Entry<String,Integer>> entryList = new ArrayList<>(map.entrySet());
        /*Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getKey().compareTo(o1.getKey());
            }
        });*/
      //  Collections.sort(entryList,(entry1, entry2)->entry2.getKey().compareTo(entry1.getKey()));
      //  entryList.stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
      //  System.out.println(entryList);

      /*  Map<Employee,Integer> treemap = new TreeMap(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.getSalary()-o1.getSalary());
            }
        });*/
        Map<Employee,Integer> treemap = new TreeMap<>((emp1,emp2)->(int)(emp2.getSalary()-emp1.getSalary()));
        treemap.put(new Employee(10,"carry","IT",20000),100);
        treemap.put(new Employee(40,"merry","CIVIL",30000),400);
        treemap.put(new Employee(50,"Henry","CS",40000),600);
        treemap.put(new Employee(80,"carry","Mechanical",80000),200);

        //System.out.println("treemap "+treemap);

        treemap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getId).reversed()))
                .forEach(entry-> System.out.println(entry));


    }
}
