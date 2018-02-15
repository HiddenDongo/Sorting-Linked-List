/*	Sorted Linked List using Sentinel Node
	Kalyan Kola Cahill - C16357813
	DT228/2 - 15/02/2018
*/
package ie.dit;

class SortedLL
{
    Node head, z;
    
	//Node Structure
    private static class Node{
        int data;
        Node next;
    }	
	
	//Constructor
    public SortedLL(){
        this.head = new Node();
        this.z = new Node();
        this.z.next = this.z;
        this.z = this.z.next;
		this.head.next = this.z;
    }

	//Print Nodes Method
    public void display()
	{
        Node t = new Node();
		t = this.head;
        
        System.out.print("\nHead -> ");
        while(t != this.z) {
            System.out.print(t.data + " -> ");
            t = t.next;
        }
        System.out.println("Z\n");
    }	
	
	//Linked List Insert Node Method
    public void insert(int x)
    {
        Node newNode = new Node();
        newNode.data = x;
		Node current = new Node();
		current = this.head;
        
        while(current.next != this.z && x > current.next.data)
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
		
		return;
    }
    
	//Linked List Main Method
    public static void main(String[] args)
    {
        SortedLL list = new SortedLL();
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
    }
}