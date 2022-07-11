package myPersons;

public class myPerson {
    private String name;
    private int age;

    public myPerson(String name) {
        this(name, 0);
        this.name = name;
    }

    public myPerson(String name, int age){
        this.name = name;
        if (age >= 0 && age<=150 ) {
            //if not valid, set default age 0
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {  //check age, don't set if not valid
            this.age = age;
        }
    }

//    private boolean isValidAge(int ageNew){
  //      return ageNew >=0 && ageNew<==150;
    //}

    @Override
    public String toString() {
        return "MyPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

