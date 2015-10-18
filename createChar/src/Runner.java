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
public class Runner {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        CharacterSheetModel aChar = new CharacterSheetModel();
        
        aChar.addChar();
        aChar.showAllUsers();

       // aChar.deleteAddedUsers();
        
    }
	
}
