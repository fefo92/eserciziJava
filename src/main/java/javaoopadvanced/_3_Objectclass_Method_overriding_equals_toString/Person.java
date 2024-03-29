package javaoopadvanced._3_Objectclass_Method_overriding_equals_toString;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person() {
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
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Persona= name: " + name + ", age: " + age + ", address: " + address;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Person p = (Person) obj;
        return Objects.equals(this.name, p.name);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}

