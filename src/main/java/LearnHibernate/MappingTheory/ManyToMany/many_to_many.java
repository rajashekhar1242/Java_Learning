package LearnHibernate.MappingTheory.ManyToMany;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class many_to_many {
    public static void main(String[] args) {
        Laptop lap1=new Laptop();
        lap1.setLap_id(1);
        lap1.setLap_name("Asus");
        lap1.setLap_ram(24);

        Laptop lap2=new Laptop();
        lap2.setLap_id(3);
        lap2.setLap_name("Dell");
        lap2.setLap_ram(16);

        Laptop lap3=new Laptop();
        lap3.setLap_id(4);
        lap3.setLap_name("Hp");
        lap3.setLap_ram(24);

        Developer dev1=new Developer();
        dev1.setId(101);
        dev1.setName("A");
        dev1.setAge(22);


        Developer dev2=new Developer();
        dev2.setId(102);
        dev2.setName("B");
        dev2.setAge(25);


        Developer dev3 =new Developer();
        dev3.setId(103);
        dev3.setName("C");
        dev3.setAge(23);


        dev1.setLaptops(Arrays.asList(lap1,lap2));
        dev2.setLaptops(Arrays.asList(lap2,lap3));
        dev3.setLaptops(Arrays.asList(lap1));

        lap1.setDevs(Arrays.asList(dev1,dev3));
        lap2.setDevs(Arrays.asList(dev1,dev2));
        lap3.setDevs(Arrays.asList(dev3));



        SessionFactory sf=new Configuration()
                .addAnnotatedClass(Developer.class)
                .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();


        session.persist(lap1);
        session.persist(lap2);
        session.persist(lap3);
        session.persist(dev1);
        session.persist(dev2);
        session.persist(dev3);

        tx.commit();


        Developer data=session.find(Developer.class,102);
        session.close();
        sf.close();

        System.out.println(data);
}
}
