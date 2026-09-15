package LearnHibernate.HQL;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.List;

public class fetchData {
    public static void main(String[] args) {

        SessionFactory sf=new Configuration()
                .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();
        Session session=sf.openSession();

        //select * from laptop where laptop_ram=24 -->sql
        // from laptop where ram=24 ->HQL

        Query query=session.createQuery("from Laptop where ram=24",Laptop.class);
        List<Laptop> laptops=query.getResultList();


        System.out.println(laptops);

    }
}
