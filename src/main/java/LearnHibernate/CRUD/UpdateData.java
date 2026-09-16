package LearnHibernate.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateData {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setId(3);
        s1.setName("harsh");
        s1.setAge(30);
        try {
            SessionFactory sf=new Configuration()
                    .addAnnotatedClass(Student.class)
                    .configure()
                    .buildSessionFactory();
            Session session=sf.openSession();
            Transaction tx=session.beginTransaction();

            //merge or fetch and commit
//            Student result=session.find(Student.class,3);
//            result.setName("harsha");

            //using  merge
            session.merge(s1);

            tx.commit();
            session.close();
            System.out.println(s1);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
