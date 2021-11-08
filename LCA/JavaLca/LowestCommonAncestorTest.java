package JavaLca;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

//Using JUNIT FrameWork
public class LowestCommonAncestorTest {
	
	@Test
	public void testLCA()
	{
		LowestCommonAncestor test = new LowestCommonAncestor(12);
		
		// Testing before edges are added
		assertEquals(-1,test.LCA(4, 7));

		// Greated DAG
		 
		test.addEdge(0, 1);
		test.addEdge(0, 2);
		test.addEdge(1, 4);
		test.addEdge(1, 6);
		test.addEdge(2, 3);
		test.addEdge(2, 4);
		test.addEdge(2, 6);
		test.addEdge(6, 5);
		test.addEdge(6, 7);
		test.addEdge(7, 8);
		
		// Testing basic functionality
		assertEquals(1,test.LCA(4,7));
		assertEquals(1,test.LCA(7,4));
		
		// Testing where one value is ancestor of another
		assertEquals(7,test.LCA(7,8));
		
		// Testing where node is created but not connected
		assertEquals(-1,test.LCA(10, 7));
		
		// Joining nodes 6 -> 4 and retesting basic functionality
		test.addEdge(6, 4);	
		assertEquals(6, test.LCA(7,4));
		
		// Testing on directed CYCLICAL graph
		test.addEdge(8, 0);
		assertEquals(-1,test.LCA(4, 7));
		
	}
	
}