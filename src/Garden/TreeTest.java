package Garden;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TreeTest {
   Tree tree = null;
	@Before
	public void setUp() throws Exception {
	
System.out.println("test start!");
tree = new Tree();}
	@After
	public void tearDown() throws Exception {
	
System.out.println("Tree will be delate!");
tree =null;	}
@Test
	public void treeName() {
		tree.setName("apple");
		assertEquals("banana",tree.getTreeName());// TODO
System.out.println("name attribut is tested!");	
}

}
