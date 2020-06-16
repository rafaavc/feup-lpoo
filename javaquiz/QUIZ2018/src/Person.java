import java.util.Objects;

public abstract class Person extends User implements Comparable<Person> {
    protected String name;
    protected int age;

    public Person(String name) {
        super(name, 0);
        this.age = 0;
        this.name = name;
    }

    public Person(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Person person;
        try {
            person = (Person) o;
        } catch(Exception e) {
            return false;
        }
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Person person) {
        return name.compareTo(person.getName());
    }
}
