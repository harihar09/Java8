package Java8.commonFiles;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonService {

    public List<PersonModel> sortedUserList(){

        List<PersonModel> sortedList =new PersonDAO().getUsers();
      //  Collections.sort(sortedList,new FunctionalInterface.commonFiles.MyComparator());

     /*   Collections.sort(sortedList, new Comparator<FunctionalInterface.commonFiles.PersonModel>() {
            @Override
            public int compare(FunctionalInterface.commonFiles.PersonModel o1, FunctionalInterface.commonFiles.PersonModel o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/

        Collections.sort(sortedList,(o1,o2)-> o1.getName().compareTo(o2.getName()));

        return  sortedList;
    }

    public static void main(String[] args) {
        System.out.println(new PersonService().sortedUserList().stream().filter(p->p.getAge() <40).map(p->p.getName()).
                collect(Collectors.toList()));

    }
}

class MyComparator implements Comparator<PersonModel>{

    @Override
    public int compare(PersonModel o1, PersonModel o2) {
        return o1.getAge() - o2.getAge();
    }
}
