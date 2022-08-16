public class BinarySearchTree<K extends Comparable<K>> {

    public Node<K> root;

    //This method adds first node as root then adds next nodes recursively
    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }

    /* This method first checks if binary tree has root or not
     *  then adds root key.Then next node is compared with root key,if
     *  it's value is less than root its added to left node & if
     *  it's value is more than root its added to right node. */
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

}