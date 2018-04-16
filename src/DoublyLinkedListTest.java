import static org.junit.Assert.*;

public class DoublyLinkedListTest {
    private DoublyLinkedList list;
    //Might need to be deleted
    private Legocsv legocsv;

    @org.junit.Before
    public void Before()
    {
        this.list = new DoublyLinkedList();
        //Might need to be deleted
        legocsv = new Legocsv();
    }

    @org.junit.Test
    public void push()
    {
        //Arrange
        LegoItem itemOne = Legocsv.itemsArray[0];
        LegoItem itemTwo = Legocsv.itemsArray[1];
        //Act
        this.list.push(itemOne);
        //Assert
        assertEquals(itemOne, this.list.head.data);
        //ActAgain
        this.list.push(itemTwo);
        //AssertAgain
        assertEquals(itemTwo, this.list.head.data);
    }

    @org.junit.Test
    public void insertAfter()
    {
        //Arrange
        LegoItem itemOne = Legocsv.itemsArray[0];
        LegoItem itemTwo = Legocsv.itemsArray[1];
        //Act
        this.list.push(itemOne);
        this.list.insertAfter(this.list.head, itemTwo);
        //Assert
        assertEquals(itemTwo, this.list.head.next.data);
    }

    @org.junit.Test
    public void append()
    {
        //Arrange
        LegoItem itemOne = Legocsv.itemsArray[0];
        LegoItem itemTwo = Legocsv.itemsArray[1];
        //Act
        this.list.append(itemOne);
        //Assert
        assertEquals(itemOne, this.list.head.data);
        //ActAgain
        this.list.append(itemTwo);
        //ArrangeAgain
        assertEquals(itemTwo, this.list.head.next.data);
    }
}