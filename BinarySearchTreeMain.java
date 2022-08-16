public class BinarySearchTreeMain {

    public static void main(String[] args) {

        //printing welcome message
        System.out.println("Welcome To Binary Search Tree Program.\n");
        System.out.println("Binary Search Tree to add 56,30 & 70.");

        //UC1-creating binaryTree object to add nodes
        BinarySearchTree<Integer> binaryTree = new BinarySearchTree<Integer>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);

        System.out.println(binaryTree.root );

        //UC2-Binary Search Tree With size
        System.out.println("\nBinary Search Tree Using Size:");
        int numberArray[] = {56, 30, 70, 22, 40, 60, 95, 11, 65, 3, 16, 63, 67};
        for (int number : numberArray) {
            binaryTree.add(number);
        }
        System.out.println(binaryTree.root);
        System.out.println("\nSize is : " + binaryTree.getSize());

    }
}