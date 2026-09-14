package LearnHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(6);
        student.setName("gagan");
        student.setAge(18);

        //1.Configuration
        Configuration cfg=new Configuration();
        cfg.addAnnotatedClass(LearnHibernate.Student.class);
        //configure file in resources  cfg.xml
        cfg.configure();

        //2.session creation
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();

        //3.Transaction begin
        Transaction tx=session.beginTransaction();

        //Persist or relation mapping
        session.persist(student);

        //commit
        tx.commit();
        session.close();
        sf.close();



    }
}
