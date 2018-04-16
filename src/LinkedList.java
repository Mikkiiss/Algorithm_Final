class LinkedList {

    //Head of list
    Node head;

    //Linked list Node class
    class Node {
        //declare Node class fields
        public Object data;
        public Node next = null;
        //Constructor for Node class, parameter is generic data object
        Node(Object data)
        {
            this.data = data;
        }
    }

    //Insert a new Node at front of the list
    public void push(Object new_data)
    {
        //Create node with the data
        Node new_node = new Node(new_data);

        //Make the new_node next the head
        new_node.next = this.head;

        //Make the new_node the head
        this.head = new_node;
    }

    //Inserts a new node after prev_node
    public void insertAfter(Node prev_node, Object new_data)
    {
        //Check if the prev_node is null
        if (prev_node == null) return;

        //Create node with the data
        Node new_node = new Node(new_data);

        //Make next of new_node as next of prev_node
        new_node.next = prev_node.next;

        //Make next of prev_node as new_node
        prev_node.next = new_node;
    }

    //Adds a node to the end of the list
    public void append(Object new_data)
    {
        //Create node with the data
        Node new_node = new Node(new_data);

        //New_node will be last so next is set to null
        new_node.next = null;

        //If list is empty the new_node is the head
        if (this.head == null)
        {
            this.head = new Node(new_data);
            return;
        }

        //Else find last node of the list
        Node last = this.head;
        while (last.next != null) last = last.next;

        //Change the next of last node
        last.next = new_node;
    }
}