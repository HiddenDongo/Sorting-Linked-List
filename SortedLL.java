// Sorted linked list with a z node
// Skeleton code

class SortedLL
{
    Node head, z;
    private long size;
    
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
    }
    public boolean insert(int x)
    {
        Node t = new Node();
        t.data = x;
        
        if(this.z.next == this.z){
            this.head.data = x;
            this.head.next = this.z;
            this.z.next = this.head;
            
        } else if(this.head.data >= x){
            t.next = this.head;
            this.head = t;
            this.z.next = t;
        } else {
            Node current = new Node();

            for (current = this.head;
                 current.next != this.z && current.next.data < x;
                 current = current.next);
            
            
            t.next = current.next;
            current.next = t;
        }
        return true;
    }

    public void remove(int x) 
	{
		
		return;
    }
    
    public void display()
	{
        Node t = new Node();
		t = this.z.next;
		//t = this.head;
        
        System.out.print("\nHead -> ");
        while(t != this.z) {
            System.out.print(t.data + " -> ");
            t = t.next;
        }
        System.out.println("Z\n");
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