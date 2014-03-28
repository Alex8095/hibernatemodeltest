import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.frogorf.metro.domain.Station;

/**
 * 
 */

/** @author Tsurkin Alex
 * @version */
public class mainTest {

	/** @param args */
	public static void main(String[] args) {
		Station station = new Station();

		System.out.println("test");

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(station);
		session.getTransaction().commit();
		session.close();
	}
}
