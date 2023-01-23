class Node:
    def __init__(self,data):
        self.data = data
        self.next = None
    
class Stack:
    def __init__(self):
        self.top = None
    
    def isEmpty(self):
        if self.top == None:
            return True
        return False
    
    def push(self,data):
        newNode = Node(data)
        if self.top == None:
            self.top = Node(data)
        newNode.next = self.top
        self.top = newNode

    def pop(self):
        if self.top ==None:
            print("Stack is empty!")
        self.top = self.top.next

    def printStack(self):
        curr = self.top
        while curr.next is not None:
            print(curr.data)
            curr = curr.next

    def peek(self):
        if self.top == None:
            print("Stack is empty")
            return
        return print("Top element is:",self.top.data)

Stack1 = Stack()
Stack1.push(5)
Stack1.push(2)
Stack1.push(222)
Stack1.push(20)
Stack1.push(50)
# Stack1.pop()
Stack1.printStack()
Stack1.peek()

