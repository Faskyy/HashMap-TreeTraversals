import java.util.LinkedList;
import java.util.List;

public class Problem1Tree {
private static List<Integer> nodeList = new LinkedList<>();
// returns a list of binary-tree nodes in in-order.

public static List<Integer> createList(TreeNode node) {
// YOUR CODE HERE
	
	//uncomment a traverse tree to see
// a) PRE-ORDER TRAVERSE TREE
nodeList = PreOrder(node);

// b) IN-ORDER TRAVERSE TREE
 //nodeList = InOrder(node);

// c) POST-ORDER TRAVERSE TREE
// nodeList = PostOrder(node);

return nodeList;
}

// PRE-ORDER METHOD
public static List<Integer> PreOrder(TreeNode node) {
if (node == null)
return nodeList;

// PARENT THEN LEFT THEN RIGHT
nodeList.add((Integer) node.data);

if (node.left != null)
createList(node.left); // ADD node.left recursivly
if (node.right != null)
createList(node.right); // ADD node.right by calling createList recursivly

return nodeList;
}

// IN ORDER METHOD
public static List<Integer> InOrder(TreeNode node) {
// b) IN ORDER TRAVERSE

// LEFT THEN PARENT THEN RIGHT
if (node.left != null)
createList(node.left);

nodeList.add((Integer) node.data);

if (node.right != null)
createList(node.right); // ADD node.right by calling createList recursivly

return nodeList;
}

// POST ORDER METHOD
public static List<Integer> PostOrder(TreeNode node) {
// c) POST ORDER TRAVERSE

// LEFT THEN RIGHT THEN PARENT
if (node.left != null)
createList(node.left); // ADD node.left recursivly

if (node.right != null)
createList(node.right); // ADD node.right by calling createList recursivly

nodeList.add((Integer) node.data);

return nodeList;
}

public static void main(String[] args) {
// Declare the 11 nodes for the problem 1 example
TreeNode root, node1, node2, node3, node4, node5, node6,
node7, node8, node9, node10;

// Initialize problem 1 tree data
root = new TreeNode(49);
node1 = new TreeNode(21);
node2 = new TreeNode(68);
node3 = new TreeNode(20);
node4 = new TreeNode(40);
node5 = new TreeNode(55);
node6 = new TreeNode(11);
node7 = new TreeNode(19);
node8 = new TreeNode(33);
node9 = new TreeNode(44);
node10 = new TreeNode(66);

// link the nodes as shown in the picture
// (the tree picture is in the homework instructions)
// PRE-ORDER Traverse to comment if calling IN-ORDER or POST ORDER
root.left = node1; root.right = node2;
node1.left = node3; node1.right = node4;
node2.left = node5;
node3.left = node6; node3.right = node7;
node4.left = node8; node4.right = node9;
node5.right = node10;

// IN-ORDER Treverse to uncomment if calling IN ORDER
/* node7.left = node6;
node1.left = node7; node7.right = node3;
root.left = node1;
node4.left = node8; node1.right = node4;
node4.right = node9;
root.right = node2;
node5.right = node10;
node2.left = node5;
*/
/*
// POST-ORDER TRAVERSE to umcomment if calling POST ORDER
node7.left = node6; node7.right = node3;
node1.left = node7;
node4.left = node8; node4.right = node9;
node1.right = node4;
node5.right = node10;
node2.left = node5;
root.right = node2; root.left = node1;
*/
// print the list of tree nodes
System.out.println(createList(root));
//System.out.println(createList(node3));
}
