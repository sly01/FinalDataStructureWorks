/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

/**
 *
 * @author erkoc
 */
public class Tree {

    private Node root;

    public Node find(int key) {

        Node current = root;
        while (current.data != key) {
            if (key < current.data) {
                current = current.leftNode;
            } else {
                current = current.rightNode;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public Node findMin() {
        Node current, last = null;
        current = root;
        while (current != null) {
            last = current;
            current = current.leftNode;
        }
        return last;
    }

    public Node findMax() {
        Node current, last = null;
        current = root;
        while (current != null) {
            last = current;
            current = current.rightNode;
        }
        return last;
    }

    public void insert(int key) {
        Node newNode = new Node(key);

        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (key < current.data) {
                    current = current.leftNode;
                    if (current == null) {
                        parent.leftNode = newNode;
                        return;
                    }
                } else {
                    current = current.rightNode;
                    if (current == null) {
                        parent.rightNode = newNode;
                        return;
                    }
                }
            }
        }
    }
}
