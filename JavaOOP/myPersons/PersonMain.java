package myPersons;

public class PersonMain {
    public static void main(String[] args) {
        myPerson[] persons = {
                new myPerson("Janko"),
                new myPerson("Peter", 20),

        };

        for (myPerson person : persons) {
            System.out.println(person);
        }
        myPerson p1 = new myPerson("jan");
        myPerson p2 = p1;
        p2.setName("Peter");
        System.out.println(p1);
        System.out.println(p2);

        myPerson p3 = new myPerson("Tomas");

        }
    }

