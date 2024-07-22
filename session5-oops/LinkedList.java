import java.util.ArrayList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public String toString() {
        Node thead = this.head;
        ArrayList<Integer> nodes = new ArrayList<>();

        while (thead != null) {
            nodes.add(thead.data);
            thead = thead.next;
        }

        return nodes.toString();
    }

    void insertAtTail(int data) {
        // create a new node
        Node newNode = new Node(data);

        // check if the list is empty
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node thead = this.head;

            while (thead.next != null) {
                thead = thead.next;
            }

            thead.next = newNode;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(5);
        list.insertAtTail(6);

        System.out.println(list);
    }
}