class Queue
{
    //Declare variables
    private int rear;
    private int size;
    private Object[] array;

    //Constructor for the queue, all it's fields are initialized, parameter is the size of the queue
    public Queue(int size) {
        this.size = size;
        this.rear = 0;
        this.array = new Object[this.size];
    }

    // Queue is full when this.rear is equal to this.size - 1
    public boolean isFull()
    {
        return ((this.size) == this.rear);
    }

    // Queue is empty when rear is 0
    public boolean isEmpty()
    {
        return (this.rear == 0);
    }

    // Method to add an item to the queue
    // It changes rear
    public boolean enqueue(Object item)
    {
        //If the queue is full, do not enqueue and return false
        if (isFull()) return false;
        //Otherwise add object to the rear and increase rear
        this.array[this.rear] = item;
        this.rear++;
        //Return true
        return true;
    }

    // Method to remove the first item from queue
    // It changes rear
    public Object dequeue()
    {
        //If the queue is empty, do not dequeue and return null
        if (isEmpty()) return null;
        //Initialize item to return as the first object in the array
        Object item = this.array[0];
        //For each item in the array
        for(int i = 0; i < this.rear - 1; i++)
        {
            //Move all objects in the array one index forward
            this.array[i] = this.array[i + 1];
        }
        //Decrease rear
        this.rear--;
        //Return the initialized item
        return item;
    }

    // Method to get front of queue
    public Object front()
    {
        //If the queue is empty, return null
        if (isEmpty()) return null;
        //else return first object in the array
        return this.array[0];
    }

    // Method to get rear of queue
    public Object rear()
    {
        //If the queue is empty, return null
        if (isEmpty()) return null;
        //else return last object in the array
        return this.array[this.rear - 1];
    }
}