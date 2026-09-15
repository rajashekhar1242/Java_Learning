package LearnHibernate.MappingTheory.oneToOne;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class one_to_one {
    public static void main(String[] args) {
        Laptop lap1 =new Laptop();
        lap1.setLap_id(2);
        lap1.setLap_name("Asus");
        lap1.setLap_ram(26);


        Developer dev=new Developer();
        dev.setId(104);
        dev.setName("raju");
        dev.setAge(22);
        dev.setLaptop(lap1);


       try{
           SessionFactory sf=new Configuration()
                   .addAnnotatedClass(Developer.class)
                   .addAnnotatedClass(Laptop.class)
                   .configure()
                   .buildSessionFactory();
           Session session=sf.openSession();
           Transaction tx=session.beginTransaction();


           session.persist(lap1);
           session.persist(dev);

           tx.commit();

           Developer data=session.find(Developer.class,dev.getId());

           System.out.println(data);



       }
       catch(Exception e){
           System.out.println(e);
       }
    }
}
