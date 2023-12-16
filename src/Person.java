import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        if (getAge().isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean hasAddress() {
        if (getAddress().isEmpty()) {
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        hasAddress();
    }

    public void happyBirthday() {
        OptionalInt.of(age + 1);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name=").append(name).append(", Surname=").append(surname).append(", age=").append(age).append(", address=").append(address);
        return builder.toString();
    }

    //   @Override
    //   public int hashCode() { /*...*/ }

    public PersonBuilder newChildBuilder() {
        new PersonBuilder()
                .setSurname(surname)
                .setAddress(address)
                .setAge(1)
                .build();
        return this.newChildBuilder();
    }
}
