import static org.junit.Assert.*;

public class StackTest {
    private Stack stack;
    //Might need to be deleted
    private Legocsv legocsv;

    @org.junit.Before
    public void Before()
    {
        this.stack = new Stack(3);
        //Might need to be deleted
        legocsv = new Legocsv();
    }

    @org.junit.Test
    public void isEmpty()
    {
        //Arrange
        LegoItem itemOne = Legocsv.itemsArray[0];
        //Act
        this.stack.push(itemOne);
        //Assert
        assertFalse(this.stack.isEmpty());
        //ActAgain
        this.stack.pop();
        //AssertAgain
        assertTrue(this.stack.isEmpty());
    }

    @org.junit.Test
    public void push()
    {
        //Arrange
        LegoItem itemOne = Legocsv.itemsArray[0];
        LegoItem itemTwo = Legocsv.itemsArray[1];
        LegoItem itemThree = Legocsv.itemsArray[2];
        LegoItem itemFour = Legocsv.itemsArray[3];
        //Act
        this.stack.push(itemOne);
        this.stack.push(itemTwo);
        this.stack.push(itemThree);
        //Assert
        assertFalse(this.stack.push(itemFour));
    }

    @org.junit.Test
    public void pop()
    {
        //Arrange
        LegoItem itemOne = Legocsv.itemsArray[0];
        //Act
        this.stack.push(itemOne);
        this.stack.pop();
        //Assert
        assertTrue(this.stack.isEmpty());
    }

    @org.junit.Test
    public void popEmpty()
    {
        //Arrange
        LegoItem itemOne = Legocsv.itemsArray[0];
        //Act
        this.stack.push(itemOne);
        this.stack.pop();
        //Assert
        assertEquals(null, this.stack.pop());
    }
}