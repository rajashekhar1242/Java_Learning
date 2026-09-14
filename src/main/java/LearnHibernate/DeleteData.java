package LearnHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteData {
    public static void main(String[] args) {
        Student result=null;
        try {
            SessionFactory sf=new Configuration()
                    .addAnnotatedClass(Student.class)
                    .configure()
                    .buildSessionFactory();
            Session session=sf.openSession();
            Transaction tx=session.beginTransaction();

            //fetch with id and delete
            result=session.find(Student.class,6);
            session.remove(result);

            tx.commit();
            System.out.println(result);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
