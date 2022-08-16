public class BinarySearchTree<K extends Comparable<K>> {

    public Node<K> root;

    //This method adds first node as root then adds next nodes recursively
    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }

    /* This method first checks if binary tree has root or not
     * then adds root key.Then next node is compared with root key,if
     * it's value is less than root its added to left node & if
     * it's value is more than root its added to right node. */
    public Node<K> addRecursively(Node<K> current, K key) {

        if (current == null)
            return new Node<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0)
            return current;
        else if (compareResult < 0)
            current.leftNode = addRecursively(current.leftNode, key);
        else {
            current.rightNode = addRecursively(current.rightNode, key);
        }
        return current;

    }

    public int getRecursive(Node<K> current) {
        return current == null ? 0 : 1 + this.getRecursive(current.leftNode) + this.getRecursive(current.rightNode);
    }

    //returns the size of Binary Search Tree
    public int getSize() {
        return this.getRecursive(root);
    }

    //returns true if node is present
    public boolean isPresent(K value) {
        return search(root, value);
    }

    /* This method recursively compares root key &
     * searches for left or right nodes */
    public boolean search(Node<K> root, K value) {

        if (root != null && root.key == value) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (root.key.compareTo(value) < 0) {
            return search(root.rightNode, value);
        }
        else {
            return search(root.leftNode, value);

        }
    }
}