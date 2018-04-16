class Stack
{
    //Declare fields
    private int size;
    private int top;
    private Object[] array;

    //Constructor for the stack, all it's fields are initialized, parameter is the size of the queue
    public Stack(int size)
    {
        this.top = -1;
        this.size = size;
        this.array = new Object[this.size];
    }

    // Stack is empty when top is smaller than 0
    public boolean isEmpty()
    {
        return (this.top < 0);
    }

    // Method to push an item to the stack
    // It changes top
    public boolean push(Object item)
    {
        //If the top is equal to the the size -1
        if (this.top == this.size - 1)
        {
            //Stack full ,return false
            return false;
        }
        else
        {
            //Else add item to top and return true
            this.array[++this.top] = item;
            return true;
        }
    }

    // Method to pop an item from the stack
    // It changes top
    public Object pop()
    {
        //If top is is smaller than 0, stack is empty, return null
        if (this.top < 0)
        {
            return null;
        }
        else
        {
            //Else return the item from the top and decrease top by 1
            Object item = this.array[this.top--];
            return item;
        }
    }
}