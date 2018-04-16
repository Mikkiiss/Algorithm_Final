import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SmartBubbleSortTest {
    private SmartBubbleSort sbs;

    @org.junit.Before
    public void Before()
    {
        this.sbs = new SmartBubbleSort();
        //This might need to be removed
        Legocsv reader = new Legocsv();
    }

    @org.junit.Test
    public void smartBubbleSort() {
        //Arrange
        ArrayList<LegoItem> items = new ArrayList<LegoItem>();
        items.add(Legocsv.itemsArray[0]);
        items.add(Legocsv.itemsArray[1]);
        items.add(Legocsv.itemsArray[2]);
        items.add(Legocsv.itemsArray[3]);
        items.add(Legocsv.itemsArray[4]);
        //Act
        ArrayList<LegoItem> sorted = (ArrayList<LegoItem>)this.sbs.SmartBubbleSort(items);
        //Assert
        assertTrue(sorted.get(0).getPieces() < sorted.get(1).getPieces());
        assertTrue(sorted.get(1).getPieces() < sorted.get(2).getPieces());
        assertTrue(sorted.get(2).getPieces() < sorted.get(3).getPieces());
        assertTrue(sorted.get(3).getPieces() < sorted.get(4).getPieces());
    }
}