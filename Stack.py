class Stack:
    def __init__(self):
        self.items = []
        self.top = -1

    def push(self, data):
        self.items.append(data)
        self.top += 1

    def pop(self):
        self.items.pop()
        self.top -= 1

    def isEmpty(self):
        return self.top == -1

    def peek(self):
        if not self.isEmpty():
            return self.items[self.top]


# testing the stack class
stack = Stack()

stack.push(3)
stack.push(4)
stack.push(5)
stack.push(7)

# stack.pop()
# stack.pop()

print(stack.items)
print(stack.peek())
