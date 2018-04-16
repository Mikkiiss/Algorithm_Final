import java.io.IOException;
import java.util.Random;
import static org.junit.Assert.*;

public class BinarySearchTreeTest {
    private BinarySearchTree bst;
    //Might need to be deleted
    private Legocsv legocsv;

    public BinarySearchTreeTest(){
        this.bst = new BinarySearchTree();
        //Might need to be deleted
        legocsv = new Legocsv();
    }

    @org.junit.Test
    public void insertNodes(){
        //Arrange

        //Act
        for (LegoItem item : Legocsv.itemsArray ) {
            bst.insert(new Node(item.getUsd_msrp()));
        }
        //Assert
        assertEquals(323,bst.size());

    }

    @org.junit.Test
    public void findRandom(){
        //Arrange
        insertNodes(); //Needed so there is something to find in the tree
        float randomFloat = Legocsv.itemsArray[new Random().nextInt(Legocsv.itemsArray.length)].getUsd_msrp();
        //Act
        //Find a node using a random msrp value and then find the same node
        Boolean foundNode = bst.findNode(bst.findinNodes(randomFloat));
        //Assert
        assertTrue(foundNode);
    }
}