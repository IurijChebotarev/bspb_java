package ru.bspb.lessonFour.objects;


import java.util.Objects;

public abstract class Client implements Comparable<Client> {

    private String name;
    private int age;

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public abstract String toString();

    @Override
    public int compareTo(Client o) {
        return Integer.compare(this.age, o.age);
    }
}

