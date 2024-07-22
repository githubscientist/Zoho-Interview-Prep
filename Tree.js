// define the structure of a Node
class Node {
    constructor(data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class Tree {
    constructor() {
        this.root = null; // the tree is initially empty
    }

    insertNode(root, data) {
        // base condition
        if (root === null) {
            return new Node(data);
        } 

        if (data < root.data) {
            root.left =  this.insertNode(root.left, data);
        } else {
            root.right = this.insertNode(root.right, data);
        }

        return root;
    }

    insert(data) {
        this.root = this.insertNode(this.root, data);
    }

    inorder(node, nodes = []) {
        if (node !== null) {
            this.inorder(node.left, nodes);
            nodes.push(node.data);
            this.inorder(node.right, nodes);
        }
        return nodes;
    }

    preorder(node, nodes = []) {
        if (node !== null) {
            nodes.push(node.data);
            this.preorder(node.left, nodes);
            this.preorder(node.right, nodes);
        }
        return nodes;
    }

    postorder(node, nodes = []) {
        if (node !== null) {
            this.postorder(node.left, nodes);
            this.postorder(node.right, nodes);
            nodes.push(node.data);
        }
        return nodes;
    }

    levelorder() {
        let nodes = [];
        let queue = [];

        if (this.root !== null) {
            // push the first element into the queue <- enqueue
            queue.push(this.root);
            while (queue.length > 0) {
                // dequeue -> remove the first element in the array
                let node = queue.shift();

                // push the data to the nodes array
                nodes.push(node.data);

                if (node.left !== null) {
                    // the current node has a left subtree
                    queue.push(node.left);
                }

                if (node.right !== null) {
                    // the current node has a right subtree
                    queue.push(node.right);
                }
            }
        }

        return nodes;
    }
}

// create a binary tree
let tree = new Tree();

tree.insert(4);
tree.insert(6);
tree.insert(5);
tree.insert(7);
tree.insert(2);
tree.insert(3);
tree.insert(1);

console.log(tree.inorder(tree.root, []));
console.log(tree.preorder(tree.root, []));
console.log(tree.postorder(tree.root, []));
console.log(tree.levelorder());