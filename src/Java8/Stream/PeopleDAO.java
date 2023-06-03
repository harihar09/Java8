package Java8.Stream;

import java.util.ArrayList;
import java.util.List;

public class PeopleDAO {
    public List<People> getPeopleList(){
        List<People> list = new ArrayList<>();
        list.add(new People(1,"tom","johns",20));
        list.add(new People(2,"clare","hughes",30));
        list.add(new People(3,"tom","carry",50));
        return list;
    }
}
