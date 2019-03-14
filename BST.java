public class BST<E extends Comparable<E>> {

    private class Node {
        public E e;
        public Node left, right;

        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;

    public BST() {
        root = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(E e) {
//        if (root == null) {
//            root = new Node(e);
//            size++;
//        } else {
//            add(root, e);
//        }
        root = add(root, e);
    }

    private Node add(Node node, E e) {
//        if (e.equals(node.e))
//            return;
//        else {
//            if (e.compareTo(node.e) < 0 && node.left == null) {
//                node.left = new Node(e);
//                size++;
//                return;
//            } else if (e.compareTo(node.e) > 0 && node.right == null) {
//                node.right = new Node(e);
//                size++;
//                return;
//            }
//        }
        if (node == null) {
            size++;
            return new Node(e);
        }
        if (e.compareTo(node.e) < 0) {
            node.left = add(node.left, e);
        } else if (e.compareTo(node.e) > 0) {
            node.right = add(node.right, e);
        }

        return node;
    }

    public boolean contains(E e) {
        return contains(root, e);
    }

    private boolean contains(Node node, E e) {
        if (node == null)
            return false;

        if (e.compareTo(node.e) == 0)
            return true;
        else if (e.compareTo(node.e) < 0)
            return contains(node.left, e);
        else
            return contains(node.right, e);
    }

    public void preOrder() {
        preOrder(root);

    }

    private void preOrder(Node node) {
        if (node == null)
            return;
        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.println(node.e);
        inOrder(node.right);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        generateBSTstring(root, 0, res);
        return res.toString();
    }

    private void generateBSTstring(Node node, int deepth, StringBuilder res) {
        if (node == null) {
            res.append(generateDepthString(deepth) + "null\n");
            return;
        }

        res.append(generateDepthString(deepth) + node.e + "\n");
        generateBSTstring(node.left, deepth + 1, res);
        generateBSTstring(node.right, deepth + 1, res);
    }

    private String generateDepthString(int deepth) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < deepth; i++)
            res.append("--");
        return res.toString();
    }


}
