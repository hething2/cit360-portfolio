import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;


public class addUserTest2 {

	@Test
	public void adduser (){
		Session session = HibernateUtilSingleton.getSessionFactory().getCurrentSession();
        /*
         * all database interactions in Hibernate are required to be inside a transaction.
         */
        Transaction transaction = session.beginTransaction();
  	
  	Char char3 = new Char();
  	char3.setId(123);
  	char3.setCharname("fled");
  	char3.setTitle("Sir");
  	char3.setRace("Human");
  	char3.setLanguage("Common Tongue");
  	char3.setClasstype("Mage");
  	char3.setAbility1("Fireball");
  	char3.setAbility2("ice Nova");
  	char3.setAbility3("Polymorph");
  	
      session.save(char3);
      transaction.commit();
        System.out.println("generated ID is: " + char3.getId());
	}
	
	
}

