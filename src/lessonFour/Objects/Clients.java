package lessonFour.Objects;


import java.util.Objects;

public abstract class Clients implements Comparable<Clients> {

    private String name;
    private int age;

    public Clients(String name, int age) {
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
    public abstract boolean equals(Object o);

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public abstract String toString();

    @Override
    public int compareTo(Clients o) {
        if (this.age > o.age) {
            return +1;
        } else if (this.age == o.age) {
            return 0;
        } else {
            return -1;
        }
    }
}

