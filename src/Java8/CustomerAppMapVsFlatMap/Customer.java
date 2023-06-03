package Java8.CustomerAppMapVsFlatMap;

import java.util.List;


public class Customer {
    private String name;
    private String city;
    private List<Integer> phoneNumbers;

    public Customer(String name, String city, List<Integer> phoneNumbers) {
        this.name = name;
        this.city = city;
        this.phoneNumbers = phoneNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Integer> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<Integer> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
