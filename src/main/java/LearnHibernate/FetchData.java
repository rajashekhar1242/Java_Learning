package LearnHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
    public static void main(String[] args) {
        Student result=null;
        try {
            SessionFactory sf=new Configuration()
                    .addAnnotatedClass(Student.class)
                    .configure()
                    .buildSessionFactory();
            Session session=sf.openSession();

            //fetch finc(return type class,VALUE)
            result=session.find(Student.class,6);
            session.close();
            System.out.println(result);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
