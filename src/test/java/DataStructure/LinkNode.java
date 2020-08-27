package DataStructure;

public class LinkNode<T> {

    private Node head;
    private Node last;
    private int size;

    @Override
    public String toString() {
        return "LinkNode{" + "head=" + head + '}';
    }

    public boolean remove(){
        
        return true;
    }

    public boolean add(T t) {
        if (head == null) {
            head = new Node(t, null);
            last = head;
        } else {
            Node newNode = new Node(t, null);
            last.next =  newNode;
            last = newNode;
        }
        size++;
        return true;
    }




    public int getSize(){
        return size;
    }
    class Node {

        T t;
        Node next;

        public Node(T t, Node next) {
            this.t = t;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" + "t=" + t + ", next=" + next + '}';
        }

    }


}
