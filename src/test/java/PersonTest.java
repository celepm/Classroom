import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person;

public class PersonTest {
	Person p = new Person("Rafael", "Silva", 30, 'M');
	
	/*@Test
	public void testConstructor() {
		p.setFirstName("Julian");
		assertEquals(p.getFirstName().equals("Julian"),true);
		assertEquals(p.getFirstName(), "Julian");
		assertTrue(p.getFirstName().equals("Julian"));
		assertTrue(p.getFirstName() == "Julian");
		//p.setLastName("George");
		//assertEquals(p.getLastName().equals("George"),true);
		//p.setGender('F');
		//assertEquals(p.getGender().equals('F'),true);
		
	}*/
	@Test
	public void testFirstName() {
		p.setFirstName("Julian");
		assertEquals(p.getFirstName(),"Julian");
	}
	
	@Test
	public void testLastName() {
		p.setLastName("Almeida");
		assertEquals(p.getLastName(),"Almeida");
		//assertTrue(p.getLastName() == "Almeida");
	}
	
	@Test
	public void testAge() {
		p.setAge(30);
		assertEquals(p.getAge(),30);
	}
	
	@Test
	public void testGender() {
		p.setGender('F');
		assertEquals(p.getGender(),'F');
	}

}
