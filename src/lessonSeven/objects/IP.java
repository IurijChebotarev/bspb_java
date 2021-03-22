package lessonSeven.objects;

import java.util.Objects;

public class IP extends Client {

    private long ogrnCode;

    public IP(String name, int age, long ogrnCode) {
        super(name, age);
        this.ogrnCode = ogrnCode;
    }

    public long getOgrnCode() {
        return ogrnCode;
    }

    public void setOgrnCode(long ogrnCode) {
        this.ogrnCode = ogrnCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IP clients = (IP) o;
        return getOgrnCode() == clients.getOgrnCode() &&
                getAge() == clients.getAge() &&
                Objects.equals(getName(), clients.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getOgrnCode(), getAge());
    }

    @Override
    public String toString() {
        return "Clients{" + "name='" + super.getName() + "'" + ", age='" + super.getAge() + "'" + ", ogrnCode='" + ogrnCode + "'" + "}";
    }
}








