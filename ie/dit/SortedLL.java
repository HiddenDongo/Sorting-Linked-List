// Sorted linked list with a z node
// Skeleton code

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

    public void remove(int x) 
	{
		
		return;
    }
    
    public static void main(String[] args)
    {
        SortedLL list = new SortedLL();
        list.display();
        
        int i, x;
        
        for(i = 1; i <= 10; i++)  
		{
            x =  (int)(Math.random()*100.0);
            System.out.println("Inserting " + x);
            list.insert(x);
            list.display();
        }
    }
}