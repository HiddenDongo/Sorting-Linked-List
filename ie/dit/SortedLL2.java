/*	Sorted Linked List using Sentinel Node
	Kalyan Kola Cahill - C16357813
	DT228/2 - 15/02/2018
*/
package ie.dit;

class SortedLL2
{
    Node head;
    
	//Node Structure
    private static class Node{
        int data;
        Node next;
    }	
	
	//Constructor
    public SortedLL2(){
        this.head = new Node();
    }

	//Print Nodes Method
    public void display()
	{
        Node t = new Node();
		t = this.head;
        
        System.out.print("\nHead -> ");
        while(t.next != null) {
            System.out.print(t.data + " -> ");
            t = t.next;
        }
        System.out.println("End\n");
    }	
	
	//Linked List Insert Node Method
    public void insert(int x)
    {
        Node newNode = new Node();
        newNode.data = x;
		Node current = new Node();
		current = this.head;
        
        while(current.next != null && x > current.next.data)
		{
			current = current.next;
		}
		
		newNode.next = current.next;
		current.next = newNode;
		
		return;
    }

	//Linked List Remove Node Method
    public void remove(int x) 
	{
		if(this.head.next == null)
		{
			System.out.println("List is empty");
            return;
		}
		
		Node current = new Node();
		current = this.head;
		while (current.next.data != x && current.next != null)
		{
			current = current.next;	
		}
		
		if(current.next.data == x)
		{
			current.next = current.next.next;
		}
		else
		{
			System.out.println("Value not in list");
		}
		
		return;
    }
    
	//Linked List Main Method
    public static void main(String[] args)
    {
        SortedLL2 list = new SortedLL2();
        list.display();
        
        int i, x;
        
		//Inserting New Nodes and Printing List
        for(i = 1; i <= 10; i++)  
		{
            x =  (int)(Math.random()*100.0);
            System.out.println("Inserting " + x);
            list.insert(x);
            list.display();
        }
		
		//Inserting 12 and Removing
		System.out.println("Inserting 12");
		list.insert(12);
		list.display();
		System.out.println("Removing 12");
		list.remove(12);
		list.display();
    }
}