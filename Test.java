public class Test {

    public static void main(String[] args) {
        Array<Integer> array = new Array<>(4);
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        System.out.println(array);

        LinkedList<Integer> linklist = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linklist.addFirst(i);
            System.out.println(linklist);
        }
        linklist.removeLast();
        linklist.add(4, 102);
        System.out.println(linklist);
        linklist.remove(2);
        System.out.println(linklist);
        linklist.removeFirst();
        System.out.println(linklist);

        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);
            if (i % 3 == 2) {
                queue.dequeue();
                System.out.println(queue);
            }
        }

        BST<Integer> bst = new BST<>();
        int[] nums = {5, 23, 1, 5, 6, 7, 8, 32};
        for (int num : nums)
            bst.add(num);
        bst.inOrder();
        System.out.println();
        System.out.println(bst);
    }

}
