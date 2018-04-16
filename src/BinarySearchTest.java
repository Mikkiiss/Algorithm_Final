import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BinarySearchTest {
    private BinarySearch bs;
    private SmartBubbleSort sbs;

    @org.junit.Before
    public void Before() {
        this.bs = new BinarySearch();
        this.sbs = new SmartBubbleSort();
        Legocsv reader = new Legocsv();
    }

    @org.junit.Test
    public void contains (){
        //Arrange
        LegoItem itemToCompare = Legocsv.itemsArray[3];
        ArrayList<LegoItem> items = new ArrayList<LegoItem>();
        items.add(Legocsv.itemsArray[0]);
        items.add(Legocsv.itemsArray[1]);
        items.add(Legocsv.itemsArray[2]);
        items.add(Legocsv.itemsArray[3]);
        items.add(Legocsv.itemsArray[4]);
        items = (ArrayList<LegoItem>)this.sbs.SmartBubbleSort(items);
        //Act
        Boolean doesItContain = this.bs.BinarySearch(items, itemToCompare);
        //Assert
        assertTrue(doesItContain);
    }
}