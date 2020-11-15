package TQSPractica;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class UserTest extends User {
	
	@Test
	public void userSetPositionTest() {
		int row = (int)Math.random()*9;
		int column = (int)Math.random()*9;
		
		
		User user = new MockUser();
		user.userSetPosition();
		
		assertEquals(row, User.row);
		assertEquals(column, User.column);

	}
	
	@Test
	public void getRowTest() {
		User user = new MockUser();
		assertNotNull(user.getRow());
	}

	@Test
	public void getColumnTest() {
		User user = new MockUser();
		assertNotNull(user.getColumn());
	}
	
	
}