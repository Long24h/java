

public class MyLinkedListPractice {
    private int numberNodes = 0;
    private class Node{
        private Node next;
        private Object data;
        public Node(Object data){
            this.data = data;
        }
        public Object getData(){
            return this.data;
        }
    }
    private Node head;
    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numberNodes++;
    }
    public void addLast(Object data){}
}
