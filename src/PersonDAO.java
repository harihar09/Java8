import java.util.ArrayList;
import java.util.List;

public class PersonDAO {

    public List<PersonModel> getUsers(){

        List<PersonModel> listOfUsers = new ArrayList<PersonModel>();
        listOfUsers.add(new PersonModel("john",40));
        listOfUsers.add(new PersonModel("clare",50));
        listOfUsers.add(new PersonModel("patrick",29));
        listOfUsers.add(new PersonModel("pauline",25));

        return listOfUsers;
    }
}



