package LearnHibernate.MappingTheory.oneToMany;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Developer {
    @Id
    @Column(name="dev_id")
    int id;
    @Column(name="dev_name")
    String name;
    @Column(name="dev_age")
    int age;

    @OneToMany
    private List<Laptop> laptops;

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

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", laptops=" + laptops +
                '}';
    }
}
