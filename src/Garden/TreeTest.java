package Garden;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TreeTest {
 Tree tree=null;
	@Before
	public void setUp() throws Exception {
	System.out.print("Test start");
	tree=new Tree();
	System.out.print("the tree object is initialized" );}

	@After
	public void tearDown() throws Exception {
	System.out.print("the tree object will be delate");
	tree = null;
	System.out.print("Test End");}

	@Test
	public void treeName() {
		assertEquals("apple",tree.getTreeName());
		System.out.print("Treename is tested");// TODO
	}

}
