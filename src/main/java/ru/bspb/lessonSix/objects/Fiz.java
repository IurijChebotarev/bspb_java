package ru.bspb.lessonSix.objects;

import ru.bspb.lessonSix.enums.Sex;

import java.util.Objects;

public class Fiz extends Client {

    private Sex sex;

    public Fiz(String name, int age, Sex sex) {
        super(name, age);
        this.sex = sex;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fiz fiz = (Fiz) o;
        return getSex() == fiz.getSex() &&
                getAge() == fiz.getAge() &&
                Objects.equals(getName(), fiz.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSex(), getAge());
    }

    @Override
    public String toString() {
        return "Clients{" + "name='" + super.getName() + "'" + ", age='" + super.getAge() + "'" + ", sex='" + sex + "'" + "}";
    }

}






