import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class CharacterSheetModel {
    private List<Char> users;
    
    public CharacterSheetModel() {
        // TODO Auto-generated constructor stub
    	
    }
    /**
     * @param args
     */
    
    
    public void addChar() {
    	  Session session = HibernateUtilSingleton.getSessionFactory().getCurrentSession();
          /*
           * all database interactions in Hibernate are required to be inside a transaction.
           */
          Transaction transaction = session.beginTransaction();
    	
    	Char char1 = new Char();
    	char1.setId(null);
    	char1.setCharname("Meowth");
    	char1.setTitle("Sir");
    	char1.setRace("Orc");
    	char1.setLanguage("Orcish");
    	char1.setClasstype("Rogue");
    	char1.setAbility1("Eviscerate");
    	char1.setAbility2("Vanish");
    	char1.setAbility3("Slice and Dice");
    	
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
      	  session.save(char2);
    	  session.save(char1);
        transaction.commit();
          /*
           * prove that the User instances were added to the database and that
           * the instances were each updated with a database generated id.
           */
          System.out.println("aUser generated ID is: " + char1.getId());
    }
    
    public void showAllUsers() {
        Session session = HibernateUtilSingleton.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        /*
         * execute a HQL query against the database.  HQL is NOT SQL.  It is object based.
         */
        Query allUsersQuery = session.createQuery("select u from Char as u order by u.id");
        /*
         * get a list of User instances based on what was found in the database tables.
         */
        users = allUsersQuery.list();
        System.out.println("num users: "+users.size());
        /*
         * iterate over each User instance returned by the query and found in the list.
         */
        Iterator<Char> iter = users.iterator();;
        while(iter.hasNext()) {
            Char element = iter.next();
            System.out.println(element.toString());
        }
        transaction.commit();
    }
    void deleteAddedUsers() {
        // TODO Auto-generated method stub
        Session session = HibernateUtilSingleton.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        
        int numUsers = users.size();
        System.out.println("user count: "+numUsers);
        for(int i = 0; i < numUsers; i++){
            System.out.println("deleting Character "+users.get(i).getCharname());
            session.delete(users.get(i));
        }
        transaction.commit();
        /*
         * at this point the records have been removed from the database but still exist in our class list attribute.
         * Do not store lists retrieved from the database since they will be out of synch with the database table from which they come.
         * This example shows that you should not store retrieved lists.
         */
        System.out.println(users);
        users.clear();
        /*
         * now the Java instances are also gone and the database is back to its original state so the example application can be run again.
         */
        System.out.println(users);
    }
}
