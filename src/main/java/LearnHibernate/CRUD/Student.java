package LearnHibernate.CRUD;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="student_table")
public class Student {
    @Id
    private int id;
    private String name;
    private int age;
    private Address address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", adress=" + address +
                '}';
    }

    public Address getAdress() {
        return address;
    }

    public void setAdress(Address address) {
        this.address = address;
    }
}
