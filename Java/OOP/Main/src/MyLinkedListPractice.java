
public class MyLinkedListPractice<E> {

    public MyLinkedListPractice() {

    }

    private static class Node<E> {
        private E data;
        private Node next;

        public Node(E data) {
            this.data = data;
//            next = null;
        }
    }

    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
    }

    private Node head;

    public void addFirstNode(E data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }

    }

    public void addLastNode(E data) {
        Node newNode = new Node(data);
        Node node = head;
        if (head == null) {
            head = newNode;
        } else {
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
    }


    public static void main(String[] args) {
        MyLinkedListPractice<String> list = new MyLinkedListPractice<>();
        list.head = new Node<>("one");
//        list.printList();
        list.addFirstNode("three");
        list.addLastNode("four");
        list.printList();
    }
}
