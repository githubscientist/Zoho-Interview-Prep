class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class LinkedList:
    def __init__(self):
        self.head = None

    def __str__(self) -> str:
        nodes = []
        thead = self.head

        while thead != None:
            nodes.append(thead.data)
            thead = thead.next

        return str(nodes)

    def insertAtTail(self, data):
        # create a new node
        newNode = Node(data)

        # check if the list is empty
        if self.head == None:
            # list is empty
            self.head = newNode
        else:
            # list is not empty and has elements
            # create a duplicate pointer
            thead = self.head

            # move the pointer to the tail node
            while thead.next != None:
                thead = thead.next

            # now the thead pointer points to the tail node
            # update the next of the tail node to the newNode
            thead.next = newNode


list = LinkedList()

list.insertAtTail(2)
list.insertAtTail(4)
list.insertAtTail(5)
list.insertAtTail(7)

print(list)
