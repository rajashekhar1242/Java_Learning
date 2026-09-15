package LearnHibernate.MappingTheory.oneToMany;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class one_to_many {
    public static void main(String[] args) {
        Laptop lap1 =new Laptop();
        lap1.setLap_id(1);
        lap1.setLap_name("Asus");
        lap1.setLap_ram(24);

        Laptop lap2 =new Laptop();
        lap2.setLap_id(2);
        lap2.setLap_name("Dell");
        lap2.setLap_ram(16);

        Developer dev=new Developer();
        dev.setId(102);
        dev.setName("Ravi");
        dev.setAge(22);
        dev.setLaptops(Arrays.asList(lap1,lap2));


        try{
            SessionFactory sf=new Configuration()
                    .addAnnotatedClass(Developer.class)
                    .addAnnotatedClass(Laptop.class)
                    .configure()
                    .buildSessionFactory();
            Session session=sf.openSession();
            Transaction tx=session.beginTransaction();


            session.persist(lap1);
            session.persist(lap2);
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
