package myPersons;

import cars.Car;

import java.util.Arrays;

public class PersonMain {
    public static void main(String[] args) {
        myPerson[] persons = {
                new myPerson("Janko"),
                new myPerson("Peter", 20),
                new myPerson("Michaela", 250),
                new Student("Marian", "12345"),
                new Student("Marina", 99, "65532"),
                new Employee("Robert", 35, "master mega chief")
        };

        Arrays.sort(persons);

        for (myPerson person : persons) {
            person.setAge(300); //NIE
            System.out.println(person.toString()); //person.toString()
        }

        System.out.println(myPerson.JAHODA);

//        Person p1 = new Person("Jan");
//        Person p2 = p1;
//        p2.setName("Peter");
//        System.out.println(p1);
//        System.out.println(p2);
/*
        Student s1 = new Student("Matej", "384709");
        System.out.println(s1 instanceof Student);
        System.out.println(s1 instanceof myPerson);
        System.out.println(s1 instanceof Object);
        System.out.println(s1 instanceof Comparable);

        Car c = new Car("BMW");
        System.out.println(s1);
        s1.setCar(c);
        System.out.println(s1);
        s1.getCar().start();
        System.out.println(s1);
        s1.getCar().stop();
        System.out.println(s1);
        System.out.println(s1.getClass());
    }

 */
}
}