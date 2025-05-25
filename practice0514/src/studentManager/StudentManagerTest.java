package studentManager;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StudentManagerTest {
	StudentManager manager;
	

	@BeforeEach
	void setUp() throws Exception {
		manager = new StudentManager();
	}

	@Test
	void testRightAdd() {
		manager.addStudent("one");
		assertTrue(manager.hasStudent("one"));
	}
	
	@Test
	void testRightRemove() {
		manager.addStudent("two");
		manager.removeStudent("two");
		assertFalse(manager.hasStudent("two"));
	}
	
	@Test
	void testWrongAdd() { 
		manager.addStudent("one");
		assertThrows(IllegalArgumentException.class, () -> {
			manager.addStudent("one");
		});
	}
	
	@Test
	void testWrongRemove() {
		assertThrows(IllegalArgumentException.class, () -> {
			manager.removeStudent("four");
		});
		
	}
	

}
