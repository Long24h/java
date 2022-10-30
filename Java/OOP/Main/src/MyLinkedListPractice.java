
public class MyLinkedListPractice<E> {
    private Node head;
    private Node prev;
    public static int numNodes = 0;

    public MyLinkedListPractice() {

    }

    private static class Node<E> {
        private E data;
        private Node next;


        public E getData() {
            return this.data;
        }

        public Node(E data) {
            this.data = data;
            numNodes++;
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

    public void add(E prevDataInsert, E addData) {
        Node newNode = new Node(addData);
        Node node = head;
        int count = 0;
        if (head.getData().equals(prevDataInsert)) {
            Node temp = head;
            head = newNode;
            head.next = temp;
        } else {
            while (node.next != null) {
                if (node.next.getData().equals(prevDataInsert)) {
                    Node temp = node.next;
                    node.next = newNode;
                    newNode.next = temp;
                    count++;
                    break;
                }
                node = node.next;
            }
            if (node.next == null && count == 0) {
                System.out.println("Not found " + prevDataInsert);
            }
        }
    }

    public Node<E> remove(int index) {
        Node temp = head;
        Node node = head;
        if (index >= numNodes || index < 0) {
            System.out.println("Out of bounds");
        } else if (index == 0) {
            numNodes--;
            head = head.next;
            temp = head;
        } else {
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            temp = node.next;
            node.next = node.next.next;
            numNodes--;
        }
        return temp;
    }

    public boolean remove(Object obj) {
        boolean flag = false;
        Node node = head;
        while (node != null) {
            if (head.getData().equals((E) obj)) {
                head = head.next;
                flag = true;
                numNodes--;
                break;
            } else if (node.next.getData().equals((E) obj)) {
                if (node.next.next == null) {
                    node.next = null;
                    flag = true;
                    numNodes--;
                } else {
                    node.next = node.next.next;
                    flag = true;
                    numNodes--;
                }
            }
            node = node.next;
        }
        return flag;
    }

    public static void main(String[] args) {
        MyLinkedListPractice<String> list = new MyLinkedListPractice<>();
        list.head = new Node<String>("one");
        System.out.println(numNodes);
        list.addFirstNode("three");
        System.out.println(numNodes);
        list.addLastNode("four");
        System.out.println(numNodes);
        list.add("four", "two");
        System.out.println(numNodes);
        System.out.println(list.remove(3));
        System.out.println(numNodes);
        list.addLastNode("five");
        System.out.println(numNodes);
        System.out.println(list.remove("two"));
        System.out.println(numNodes);
        list.printList();
    }
}


