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

public class HQLTest {
	private List<Char> users;
@Test
public void TestHQL () {
	CharacterSheetModel aChar = new CharacterSheetModel();
	aChar.addChar();
//CharacterSheetModel test = new CharacterSheetModel();
Session session = HibernateUtilSingleton.getSessionFactory().getCurrentSession();
Transaction transaction = session.beginTransaction();
/*
 * execute a HQL query against the database.  HQL is NOT SQL.  It is object based.
 */
Query query1 = session.createQuery("select u from Char as u order by u.id");
//query.setParameter("id", 1);
List<Char> list = query1.list();
System.out.println(list);
/*
 * get a list of User instances based on what was found in the database tables.
 */
/*
 * iterate over each User instance returned by the query and found in the list.
 */
//Iterator <Char> iter = users.iterator();
//while(iter.hasNext()) {
    //Char element = iter.next();
    //System.out.println(element.toString());
//}
transaction.commit();
}
}