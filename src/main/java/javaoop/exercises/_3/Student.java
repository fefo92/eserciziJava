package javaoop.exercises._3;

public class Student {
    private String name;
    private int age;
    private int height;
    private String city;
    private int weight;

    public Student(String name, int age, int height, String city, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.city = city;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public int getHeight() {
        return height;
    }

    public String getCity() {
        return city;
    }

    public int getWeight() {
        return weight;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public int setAge(int age) {
        if (age <= 0) {
            System.out.println("invalid age");
        } else {
            this.age = age;
        }
        return age;
    }

    public int setHeight(int height) {
        if (height <= 0) {
            System.out.println("Invalid height");
        } else {
            this.height = height;
        }
        return height;
    }

    public String setCity(String city) {
        this.city = city;
        return city;
    }

    public int setWeight(int weight) {
        if (weight <= 0) {
            System.out.println("invalid weight");
        } else {
            this.weight = weight;
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
