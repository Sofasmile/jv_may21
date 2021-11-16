package mate.lesson.linkedlist;


public class Application {

    public static void main(String[] args) {
        Node<String> node1 = new Node<>(null, "1", null);
        Node<String> node2 = new Node<>(node1, "2", null);
        node1.next = node2; // 1 <-> 2
        Node<String> node3 = new Node<>(node2, "3", null); // 2 <- 3
        node2.next = node3; // 1 <-> 2 <-> 3
        Node<String> node4 = new Node<>(node3, "4", null); // 3 <- 4
        node3.next = node4; // 1 <-> 2 <-> 3 <-> 4
        // head <- 1 <-> 2 <-> 3 <-> 4 -> tail
        // 1 <-> 2 <-> 4

        node2.next = node4;
        node4.prev = node2;

        // String value = remove(1);
        // TODO smth

        // return node3.item;

    }

    private static class Node<T> {
        T item;
        Node<T> prev;
        Node<T> next;

        public Node(Node<T> prev, T item, Node<T> next) {
            this.prev = prev;
            this.next = next;
            this.item = item;
        }
    }
}
