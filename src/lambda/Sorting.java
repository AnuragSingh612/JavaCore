package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Collections.sort(numbers);
        //Ascending Order
        numbers.sort((a,b)->a-b);
        System.out.println("Ascending: " + numbers);
        //Descending Order
        numbers.sort((a,b)->b-a);
        System.out.println("Descending: " + numbers);
        //Sorting with Comparators and Method References
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Watermelon");
        fruits.sort((a,b) ->a.length()-b.length());
        System.out.println("Fruits: " + fruits);
        fruits.sort(Comparator.comparing(String::length));
        System.out.println("Fruits: " + fruits);
        //Sorting with custom object
        List<Person> personList= Arrays.asList(new Person("Anurag",25),new Person("shruti",24),new Person("Ajay",45 ));
        //Sorting with name
        personList.sort(Comparator.comparing(person -> person.name));
        personList.forEach(person -> System.out.println(person.name));
        //Sorting with age
        personList.sort(Comparator.comparing(person -> person.age));
        personList.forEach(person -> System.out.println(person.name));
    }
}
class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

