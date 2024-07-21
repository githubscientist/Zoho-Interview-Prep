# Stack Data Structure

- Stack is a linear data structure which follows a particular order in which the operations are performed. The order may be LIFO(Last In First Out) or FILO(First In Last Out).

- Mainly the following three basic operations are performed in the stack:

  - **Push**: Adds an item in the stack. If the stack is full, then it is said to be an Overflow condition.
  - **Pop**: Removes an item from the stack. The items are popped in the reversed order in which they are pushed. If the stack is empty, then it is said to be an Underflow condition.
  - **Peek or Top**: Returns top element of stack.
  - **isEmpty**: Returns true if stack is empty, else false.

- Two ways to implement a stack:
  - Using array
  - Using linked list

https://leetcode.com/problems/valid-parentheses/

Solution:

```python
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

class Solution:
    def isValid(self, s: str) -> bool:
        # create an empty stack
        stack = Stack()

        # traverse the string
        for i in range(len(s)):
            # for every bracket,
            # if it is a opening bracket '(', '{', '['
            if s[i] in ['(', '{', '[']:
                # push the bracket to the stack
                stack.push(s[i])
            # else if it is a closing bracket
            else:
                # check if the stack is already empty
                if stack.isEmpty():
                    return False
                else:
                    # if the stack is not empty
                    if (s[i] == ')' and stack.peek() == '(') or (s[i] == '}' and stack.peek() == '{') or (s[i] == ']' and stack.peek() == '['):
                        # pop the stack
                        stack.pop()
                    else:
                        return False
        # if the stack is not empty, return false
        if not stack.isEmpty():
            return False
        else:
            # else if it is empty, we return true
            return True
```

```javascript
class Stack {
  constructor() {
    this.items = [];
    this.top = -1;
  }

  push(data) {
    this.items.push(data);
    this.top++;
  }

  pop() {
    this.items.pop();
    this.top--;
  }

  isEmpty() {
    return this.top === -1;
  }

  peek() {
    if (!this.isEmpty()) {
      return this.items[this.top];
    }
  }
}

var isValid = function (s) {
  // create an empty stack
  let stack = new Stack();

  // traverse the string
  for (let i = 0; i < s.length; i++) {
    // for every bracket,
    // check if it is a opening bracket
    if (["(", "{", "["].includes(s[i])) {
      // push the bracket to the stack
      stack.push(s[i]);
    } else {
      // a closing bracket
      if (
        (s[i] == ")" && stack.peek() == "(") ||
        (s[i] == "}" && stack.peek() == "{") ||
        (s[i] == "]" && stack.peek() == "[")
      ) {
        // pop the stack
        stack.pop();
      } else {
        return false;
      }
    }
  }

  // check if the stack is empty
  if (stack.isEmpty()) {
    return true;
  } else {
    return false;
  }
};
```

```java
// public class Stack {
//     // define the array
//     private char[] items;
//     private int top;
//     final int SIZE = 10000;

//     public Stack() {
//         // allocate memory for items
//         this.items = new char[100];
//         // initialize the top pointer to point to -1
//         this.top = -1;
//     }

//     public boolean isStackFull() {
//         return this.top == SIZE - 1;
//     }

//     public void push(char data) {
//         if (!this.isStackFull()) {
//             // increment the top pointer and push the data into items @ top index
//             this.top++;
//             this.items[this.top] = data;
//         }
//     }

//     public boolean isStackEmpty() {
//         return this.top == -1;
//     }

//     public char peek() {
//         if (!this.isStackEmpty()) {
//             return this.items[this.top];
//         }
//         return ' ';
//     }

//     public void pop() {
//         if (!this.isStackEmpty()) {
//             // decrement the top pointer
//             this.top--;
//         }
//     }
// }


class Solution {
    public boolean isValid(String s) {
        // create a new Stack
        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for(char c: s.toCharArray()){
            // check if the bracket is a closing parantheses
            if(map.containsKey(c)){
                char top = stack.isEmpty() ? '$' : stack.pop();
                if(top != map.get(c)){
                    return false;
                }
            } else {
                // it is a opening bracket
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
```

# Object Oriented Programming Concepts in Java, Python and JavaScript

- **Object Oriented Programming (OOP)** is a programming paradigm that relies on the concept of classes and objects. It is used to structure a software program into simple, reusable pieces of code blueprints (usually called classes), which are used to create individual instances of objects.

1. Class:

- A class is a blueprint or a template for creating objects.
- collection of objects is called class.

2. Object:

- An object is a real-world entity.
- An object is an instance of a class.

3. Constructor:

- A constructor is a special type of method that is used to initialize the object.
- It is called when an object is created.

4. Encapsulation:

- Encapsulation is the mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.
- example: class

5. Constructor Overloading:

- Constructor overloading is a concept in which we can create multiple constructors with the same name but with different parameters.

6. this keyword:

- this keyword is a reference variable that refers to the current object.