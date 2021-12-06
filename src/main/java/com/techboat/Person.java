package main.java.com.techboat;

public class Person {
    private String name;
    private String lastname;

    public Person() {

    }

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Person name(String name) {
        setName(name);
        return this;
    }

    public Person lastname(String lastname) {
        setLastname(lastname);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Person)) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(lastname, person.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname);
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", lastname='" + getLastname() + "'" +
                "}";
    }

}
