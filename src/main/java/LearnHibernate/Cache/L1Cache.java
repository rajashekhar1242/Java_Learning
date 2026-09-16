package LearnHibernate.Cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class L1Cache {
    public static void main(String[] args) {

        SessionFactory sf=new Configuration()
                .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();
        Session session=sf.openSession();


        Laptop l1=session.find(Laptop.class,1);

        //It will not execute Select query cause use of cache--> L1 cache
        Laptop l2=session.find(Laptop.class,1);

        session.close();
        sf.close();

    }

}
