public class BinarySearchTreeMain {

    public static void main(String[] args) {

        //printing welcome message
        System.out.println("Welcome To Binary Search Tree Program.\n");
        System.out.println("Binary Search Tree to add 56,30 & 70.");

        //creating binaryTree object to add nodes
        BinarySearchTree binaryTree = new BinarySearchTree();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);

        System.out.println(binaryTree.root);

    }
}