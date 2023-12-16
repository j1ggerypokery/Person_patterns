public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        System.out.println("Name of the Person");
        this.name = "Peter";
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        System.out.println("Surname of the Person");
        this.surname = "Jackson";
        return this;
    }

    public PersonBuilder setAge(int age) {
        System.out.println("Age of the Person");
        this.age = 31;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        System.out.println("Address of the Person");
        this.address = "NY, 56 lane";
        return this;
    }

    public Person build() {
        Person person = new Person(name, surname, age, address);
        return person;
    }
}
