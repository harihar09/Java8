package Java8.commonFiles;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    public static List<EmployeeModel> getUsers(){

        List<EmployeeModel> list = new ArrayList<>();

        list.add(new EmployeeModel("clare","HR",100000));
        list.add(new EmployeeModel("pauline","business",200000));
        list.add(new EmployeeModel("claire","civil",300000));

        return list;

    }
}
