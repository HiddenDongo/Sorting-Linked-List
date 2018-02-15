##	Sorted Linked List using Sentinel Node
##	Kalyan Kola Cahill - C16357813
##	DT228/2 - 15/02/2018

class SortedLL:

    def __init__(self):
        self.dummy = Node(None, None)
        self.dummy.next = self.dummy
        self.head = Node(self.dummy, 'Start')

	#print node method
    def print_nodes(self):
        current = self.head

        while current != self.dummy:
            print(current.data)
            current = current.next

	#insert new node method
    def insert(self, value):
        new_node = Node(None, value)
        current = self.head

		#iterates through Linked List until new node value <= current node
		#value or if we've reached the end of the Linked List
        while (current.next != self.dummy and value > current.next.data):
            current = current.next

        new_node.next = current.next
        current.next = new_node


	#remove node method	
    def remove(self, value):

		#checks that Linked List is not empty
        if self.isEmpty():
            print("List is Empty")
            return

        current = self.head

		#iterates through Linked List until the selected value = current node 
		#value or that we haven't reached the end of the Linked List
        while (current.next.data != value and current.next != self.dummy):
            current = current.next

        # If we found the value
        if current.next.data == value:
            current.next = current.next.next

        else:
            print("\nValue not in the list, you dummy!\n")



	#Linked List isEmpty method
    def isEmpty(self):
        current = self.head

        if current.next == self.dummy:
            return True
        else:
            return False

#Define Node structure
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
