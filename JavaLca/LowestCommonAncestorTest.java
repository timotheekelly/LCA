package JavaLca;

import static org.junit.Assert.*;

import org.junit.Test;

public class LowestCommonAncestorTest {

    @Test
    public void testFindLCA() {
		LowestCommonAncestor tree = new LowestCommonAncestor();
		
        // test empty tree
		assertEquals(-1, tree.findLCA(4,5));
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);

        // testing basic functionalitie
        assertEquals(2, tree.findLCA(4,5));

        assertEquals(1, tree.findLCA(4,6));

        // test left and right not real
        assertEquals(-1, tree.findLCA(13,12));

        // test right not real
        assertEquals(-1, tree.findLCA(2,12));

        // test left not real
        assertEquals(-1, tree.findLCA(12,2));
    }
	
}