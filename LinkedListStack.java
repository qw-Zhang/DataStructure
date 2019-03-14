public class LinkedListStack<E> implements Stack<E> {
    private LinkedList<E> list;

    public LinkedListStack() {
        list = new LinkedList<>();
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E peek() {
        return list.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: top ");
        res.append(list);
        return res.toString();
    }

//    public static void main(String[] args) {
//        Array<Integer> array = new Array<>(4);
//        for (int i = 0; i < 10; i++) {
//            array.addLast(i);
//        }
//        System.out.println(array);
//
//        LinkedListStack<Integer> linklist = new LinkedListStack<>();
//        for (int i = 0; i < 5; i++) {
//            linklist.push(i);
//            System.out.println(linklist);
//        }
//        linklist.pop();
//        linklist.push(102);
//        System.out.println(linklist);
//    }
}
