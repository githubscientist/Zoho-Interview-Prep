class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    constructor() {
        this.head = null;
    }

    toArray() {
        let nodes = [];
        let thead = this.head;

        while (thead != null) {
            nodes.push(thead.data);
            thead = thead.next;
        }
        return nodes;
    }

    insertAtTail(data) {
        // create a new node with the new data
        let newNode = new Node(data);

        // check if the list is empty
        if (this.head == null) {
            // list is empty
            this.head = newNode;
        } else {
            // list is not empty
            let thead = this.head;

            while (thead.next != null) {
                thead = thead.next;
            }

            thead.next = newNode;
        }
    }
}

let list = new LinkedList();

list.insertAtTail(2);
list.insertAtTail(3);
list.insertAtTail(5);

console.log(list.toArray());
