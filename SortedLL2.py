##	Sorted Linked List using Sentinel Node
##	Kalyan Kola Cahill - C16357813
##	DT228/2 - 15/02/2018

class SortedLL:

    def __init__(self):
        self.head = Node(None, 'Start')
	
	#print node method
    def print_nodes(self):
        current = self.head

        while current:
            print(current.data)
            current = current.next


	#insert new node method
    def insert(self, value):
        new_node = Node(None, value)
        current = self.head

		#iterates through Linked List until new node value <= current 
		#node value
        while (current.next != None and value > current.next.data):
            current = current.next

        new_node.next = current.next
        current.next = new_node

	#remove node method
    def remove(self, value):

		#error message if list is empty
        if self.isEmpty():
            print("List is Empty")
            return

        current = self.head

		#iterates through Linked List until current node value =
		#selected node value
        while (current.next.data != value and current.next != None):
            current = current.next

        # If we found the value
        if current.next.data == value:
            current.next = current.next.next

        else:
            print("\nValue not in the list\n")



	#Linked List isEmpty method
    def isEmpty(self):
        current = self.head

        if current.next == None:
            return True
        else:
            return False

#define Node structure
class Node:
    def __init__(self, node, data):
        self.data = data
        self.next = node



sorted_list = SortedLL()

#inserting 5 unsorted nodes into sorting Linked List
sorted_list.insert(5)
sorted_list.insert(3)
sorted_list.insert(2)
sorted_list.insert(1)
sorted_list.insert(4)
sorted_list.print_nodes()
print("\n")

#removing node from sorted Linked List
sorted_list.remove(3)
sorted_list.print_nodes()
