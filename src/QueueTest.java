import static org.junit.Assert.*;

public class QueueTest {
    private Queue queue;
    //Might need to be deleted
    private Legocsv legocsv;

    @org.junit.Before
    public void Before()
    {
        this.queue = new Queue(3);
        //Might need to be deleted
        legocsv = new Legocsv();
    }

    @org.junit.Test
    public void isFull()
    {
        //Arrange
        LegoItem itemOne = Legocsv.itemsArray[0];
        LegoItem itemTwo = Legocsv.itemsArray[1];
        LegoItem itemThree = Legocsv.itemsArray[2];
        //Act
        this.queue.enqueue(itemOne);
        this.queue.enqueue(itemTwo);
        this.queue.enqueue(itemThree);
        //Assert
        assertTrue(this.queue.isFull());
        //ActAgain
        this.queue.dequeue();
        //AssertAgain
        assertFalse(this.queue.isFull());
    }

    @org.junit.Test
    public void isEmpty()
    {
        //Arrange
        LegoItem itemOne = Legocsv.itemsArray[0];
        LegoItem itemTwo = Legocsv.itemsArray[1];
        //Act
        this.queue.enqueue(itemOne);
        this.queue.dequeue();
        //Assert
        assertTrue(this.queue.isEmpty());
        //ActAgain
        this.queue.enqueue(itemTwo);
        //AssertAgain
        assertFalse(this.queue.isEmpty());
    }

    @org.junit.Test
    public void enqueue()
    {
        //Arrange
        LegoItem itemOne = Legocsv.itemsArray[0];
        LegoItem itemTwo = Legocsv.itemsArray[1];
        LegoItem itemThree = Legocsv.itemsArray[2];
        LegoItem itemFour = Legocsv.itemsArray[3];
        //Act
        Boolean enq = this.queue.enqueue(itemOne);
        //Assert
        assertTrue(enq);
        //ActAgain
        this.queue.enqueue(itemTwo);
        this.queue.enqueue(itemThree);
        Boolean otherEnq = this.queue.enqueue(itemFour);
        //AssertAgain
        assertFalse(otherEnq);
    }

    @org.junit.Test
    public void dequeue()
    {
        //Assert
        assertEquals(null, this.queue.dequeue());
        //Arrange
        LegoItem itemOne = Legocsv.itemsArray[0];
        //Act
        this.queue.enqueue(itemOne);
        //AssertAgain
        assertEquals(itemOne, this.queue.dequeue());
    }

    @org.junit.Test
    public void front()
    {
        //Assert
        assertEquals(null, this.queue.front());
        //Arrange
        LegoItem itemOne = Legocsv.itemsArray[0];
        //Act
        this.queue.enqueue(itemOne);
        //AssertAgain
        assertEquals(itemOne, this.queue.front());
    }

    @org.junit.Test
    public void rear()
    {
        //Assert
        assertEquals(null, this.queue.rear());
        //Arrange
        LegoItem itemOne = Legocsv.itemsArray[0];
        LegoItem itemTwo = Legocsv.itemsArray[1];
        //Act
        this.queue.enqueue(itemOne);
        this.queue.enqueue(itemTwo);
        //AssertAgain
        assertEquals(itemTwo, this.queue.rear());
    }
}