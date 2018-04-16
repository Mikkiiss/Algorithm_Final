public class DoublyLinkedList
{
    //Head of list
    Node head;

    //Doubly Linked list Node
    class Node
    {
        public Object data;
        public Node prev = null;
        public Node next = null;

        // Constructor to create a new node
        public Node(Object data)
        {
            this.data = data;
        }
    }

    //Adding a node at the front of the list
    public void push(Object data)
    {
        //Create node with the data
        Node new_Node = new Node(data);

        //Make the head the next of the new_node
        new_Node.next = this.head;
        //Make the prev of new_node null
        new_Node.prev = null;

        //Change prev of head the new_node
        if(this.head != null) this.head.prev = new_Node;

        //Make the new_node the head
        this.head = new_Node;
    }

    //Insert a new node after an existing node
    public void insertAfter(Node prev_Node,Object data)
    {

        //Check for the prev_node not to be null
        if(prev_Node == null) return;

        //Create node with the data
        Node new_node = new Node(data);

        //Make next of new_node the next of prev_node
        new_node.next = prev_Node.next;

        //Make next of prev_node the new_node
        prev_Node.next = new_node;

        //Make prev of new_node the prev_node
        new_node.prev = prev_Node;

        //Change prev next_node to new_node
        if(new_node.next != null) new_node.next.prev = new_node;
    }

    //Add a node at the end of the list
    void append(Object data)
    {
        //Create node with the data
        Node new_node = new Node(data);

        //New_node will be last so next is set to null
        new_node.next = null;

        //If list is empty the new_node is the head
        if(this.head == null)
        {
            new_node.prev = null;
            this.head = new_node;
            //New node is the new head, return
            return;
        }

        //Else find last node of the list
        Node last = this.head;
        while(last.next != null) last = last.next;

        //Change the next of last node
        last.next = new_node;

        //Make the prev of new_node the last node
        new_node.prev = last;
    }
}