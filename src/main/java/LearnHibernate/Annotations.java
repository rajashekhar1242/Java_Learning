package LearnHibernate;

import jakarta.persistence.*;

//1.Class is an entity for database
@Entity
public class Annotations {

}

//2.ID tells Primary Key in db
@Entity
class stud{
    @Id
    private int id;
}


//3.Table name can be assigned
@Entity
@Table(name="stud_table")
class student{

}

//4.Transient it will not refelct in database
@Entity
class exmp{
    @Id
    private int id;
    private String name;
    @Transient
    private stud stud;
    @Transient
    private exmp exmp;
}

//5 column
@Entity
class emp{
    @Id
    private int id;
    @Column(name="stud_name")
    private String name;

}


//naming goes fomr class->entity->table



