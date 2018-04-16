import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MinMaxTest {

    private MinMax mm;

    @org.junit.Before
    public void Before() {
        this.mm = new MinMax();
        //This might need to be removed
        Legocsv reader = new Legocsv();
    }

    @org.junit.Test
    public void minMax()
    {
        //Arrange
        LegoItem[] itemsToCompare = Legocsv.itemsArray;
        LegoItem min;
        LegoItem max;
        //Act
        mm.MinMax(Arrays.asList(itemsToCompare));
        min=(LegoItem)mm.getMin();
        max=(LegoItem)mm.getMax();
        //Assert
        assertEquals(0, min.getPieces());
        assertEquals(5922, max.getPieces());
    }

}