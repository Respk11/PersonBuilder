package work;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;


    public PersonBuilder setName(String name) {
        if (name == null || name.isEmpty()) throw new IllegalStateException("Enter a name!");
        else this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        if (surname == null || surname.isEmpty()) throw new IllegalStateException("Enter a surname!");
        else this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        return new Person(name, surname, age, address);
    }
}
