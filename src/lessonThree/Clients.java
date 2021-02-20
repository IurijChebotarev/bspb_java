package lessonThree;

import java.util.Objects;

public class Clients {

    private String name;
    private char sex;
    private int age;

    public Clients(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clients clients = (Clients) o;
        return getSex() == clients.getSex() &&
                getAge() == clients.getAge() &&
                Objects.equals(getName(), clients.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSex(), getAge());
    }
}





