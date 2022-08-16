public class Node<K> {

    //node data
    K key;
    public Node<K> leftNode;
    public Node<K> rightNode;

    //Node constructor
    public Node(K key) {
        this.key = key;
        this.leftNode = null;
        this.rightNode = null;
    }

    //printing node root with left and right node value
    @Override
    public String toString() {

        return "{" + " Left Node = " + leftNode + ", Root = " + key + ", Right Node = " + rightNode + '}';
    }
}