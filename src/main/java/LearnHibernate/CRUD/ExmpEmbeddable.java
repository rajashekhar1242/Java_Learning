package LearnHibernate.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ExmpEmbeddable {
    public static void main(String[] args) {

        Address address = new Address();
        address.setCity("London");
        address.setState("Telangana");
        address.setAdress("345-45");

        Student student = new Student();
        student.setName("Juan");
        student.setAge(4);
        student.setId(10);
        student.setAdress(address);




        try {
            SessionFactory sf=new Configuration()
                    .addAnnotatedClass(Student.class)
                    .configure()
                    .buildSessionFactory();
            Session session=sf.openSession();

            Transaction tx=session.beginTransaction();

            session.persist(student);
            tx.commit();
            System.out.println(student);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
