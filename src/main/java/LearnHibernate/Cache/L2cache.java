package LearnHibernate.Cache;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class L2cache {
    public static void main(String[] args) {

        SessionFactory sf=new Configuration()
                .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();
        Session session=sf.openSession();

        Laptop l1=session.find(Laptop.class,1);

        session.close();

        Session session1=sf.openSession();
        //It will not trigger Select query once again cause of L2 cache @Cacheable
        Laptop data=session1.find(Laptop.class,1);

        session1.close();
        sf.close();

}
}
