package Java8.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Person {
    public static void main(String[] args) {
        // create list of students
        List<Student> students = Stream.of(
                        new Student("john", Gender.MALE),
                        new Student("aisha", Gender.FEMALE),
                        new Student("mark", Gender.MALE),
                        new Student("marry", Gender.FEMALE)
                )
                .collect(Collectors.toList());

        // print all female names
        students.stream()
                .filter(student -> student.getGender().equals(Gender.MALE))
                .map(student -> student.getName())
                .forEach(System.out::println);
    }

    @Data
    @AllArgsConstructor
    static class Student {
        private String name;
        private Gender gender;
    }

    enum Gender {
        MALE, FEMALE
    }
}
