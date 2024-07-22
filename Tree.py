class Node:
    def __init__(self, data) -> None:
        self.data = data
        self.left = self.right = None


class Tree:
    def __init__(self) -> None:
        self.root = None

    def insertNode(self, root, data):
        if root == None:
            return Node(data)

        if data < root.data:
            root.left = self.insertNode(root.left, data)
        else:
            root.right = self.insertNode(root.right, data)

        return root

    def preorder(self, node, nodes=[]):
        if node != None:
            nodes.append(node.data)
            self.preorder(node.left, nodes)
            self.preorder(node.right, nodes)
        return nodes

    def inorder(self, node, nodes=[]):
        if node != None:
            self.inorder(node.left, nodes)
            nodes.append(node.data)
            self.inorder(node.right, nodes)
        return nodes

    def postorder(self, node, nodes=[]):
        if node != None:
            self.postorder(node.left, nodes)
            self.postorder(node.right, nodes)
            nodes.append(node.data)
        return nodes

    def insert(self, data):
        self.root = self.insertNode(self.root, data)

    def levelorder(self):
        nodes = []
        queue = []

        if self.root != None:
            # push the first element to the queue
            queue.append(self.root)

            while len(queue) > 0:
                node = queue.pop(0)

                nodes.append(node.data)

                if node.left is not None:
                    queue.append(node.left)

                if node.right is not None:
                    queue.append(node.right)
        return nodes


tree = Tree()
tree.insert(4)
tree.insert(6)
tree.insert(5)
tree.insert(7)
tree.insert(2)
tree.insert(3)
tree.insert(1)

print(tree.inorder(tree.root, []))
print(tree.preorder(tree.root, []))
print(tree.postorder(tree.root, []))
print(tree.levelorder())
