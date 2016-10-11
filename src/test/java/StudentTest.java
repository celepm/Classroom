import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Student;

public class StudentTest {
	Student s = new Student("Rafael", "Silva", 30, 'M');
	
	@Test
	public void testFirstName() {
		s.setFirstName("Rafael");
		assertEquals(s.getFirstName(), "Rafael");
	}
	
	@Test
	public void testLastName() {
		s.setLastName("Silva");
		assertEquals(s.getLastName(), "Silva");
	}
	
	@Test
	public void testAge() {
		s.setAge(30);
		assertEquals(s.getAge(), 30);
	}
	
	@Test
	public void testGender() {
		s.setGender('M');
		assertEquals(s.getGender(), 'M');
	}
	
	@Test
	public void testFirstGrade() {
		s.setFirstGrade(10);
		assertEquals(s.getFirstGrade(), 10, 0.1);
	}

}
