package LearnHibernate.HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class fetchDataWithFilters {
    public static void main(String[] args) {

        SessionFactory sf=new Configuration()
                .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();
        Session session=sf.openSession();

        //select * from laptop where laptop_ram=24 -->sql
        // from laptop where ram=24 ->HQL


        //1.Fetch like jdbc preapredstatement ? but with ?1 ensure bug free
        int ram=24;
        Query q1=session.createQuery("from Laptop where lap_ram=?1",Laptop.class);
        q1.setParameter(1,ram);
        //return list of laptops
        List<Laptop> laptops=q1.getResultList();

        //2.Fetch ony one field or column
        Query q2=session.createQuery("select lap_name from Laptop where lap_ram=?1",String.class);
        q2.setParameter(1,ram);
        List<String> laptops1=q2.getResultList();

        //2.Fetch two Fields or columns
        Query q3=session.createQuery("select lap_id,lap_name from Laptop where lap_ram=?1",Object[].class);
        q3.setParameter(1,ram);
        List<Object[]> result=q3.getResultList();

        for(Object[] ob:result)
        {
            System.out.println(ob[0]+" "+ob[1]);
        }
// System.out.println(laptops1);

        session.close();

    }
}
