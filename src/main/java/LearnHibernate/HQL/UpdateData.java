package LearnHibernate.HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

public class UpdateData {
    public static void main(String[] args) {

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();
        //transaction is need for update or delete
        Transaction tx = session.beginTransaction();

        String hql="update Laptop l set lap_ram=?1 where lap_id= :id";

        MutationQuery q=session.createMutationQuery(hql);
        q.setParameter(1,64);
        q.setParameter("id",3);
        int rows=q.executeUpdate();
        tx.commit();
        System.out.println(rows);


    }

}
