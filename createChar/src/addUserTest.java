import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import static org.junit.Assert.*;

import org.junit.Test;
public class addUserTest {

	@Test
	public void adduser (){
		Session session = HibernateUtilSingleton.getSessionFactory().getCurrentSession();
        /*
         * all database interactions in Hibernate are required to be inside a transaction.
         */
        Transaction transaction = session.beginTransaction();
  	
  	Char char2 = new Char();
  	char2.setId(null);
  	char2.setCharname("Delf");
  	char2.setTitle("Sir");
  	char2.setRace("Human");
  	char2.setLanguage("Common Tongue");
  	char2.setClasstype("Mage");
  	char2.setAbility1("Fireball");
  	char2.setAbility2("ice Nova");
  	char2.setAbility3("Polymorph");
  	
      session.save(char2);
      transaction.commit();
        System.out.println("generated ID is: " + char2.getId());
	}
	
	
}
