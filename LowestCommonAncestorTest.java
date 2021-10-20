import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

class LowestCommonAncestorTest {

	//test if the constructor works
	@Test
	void testConstructor() {
		new LowestCommonAncestor();
	}
	
	@Test
	void testNodeConstructor() {
	new Node(1);
	}
	
	@Test
	void testTreeConstruction() {
		LowestCommonAncestor tree = new LowestCommonAncestor();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		
		assertEquals("Checking the root is equal to 1", 1, tree.root.data);
		assertEquals("Checking if the roots left branch is equal to 2", 2, tree.root.left.data);
		assertEquals("Checking if the roots right branch is equal to 3", 3, tree.root.right.data);
		
	}
	
	@Test
	void testLCA(){
		LowestCommonAncestor tree = new LowestCommonAncestor();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);

		Node lca = tree.findLCA(4, 5);
		assertEquals("Checking if the LCA of 4 and 5 is equal to 2", 2, lca.data);
		
		lca = tree.findLCA(6, 7);
		assertEquals("Checking if the LCA of 6 and 7 is equal to 3", 3, lca.data);
		
		lca = tree.findLCA(6, 10);
		assertNull("Checking if a number is not apart of the tree that null is passed", lca);
	}

}
