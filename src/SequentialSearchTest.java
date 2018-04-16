import java.util.Arrays;

import static org.junit.Assert.*;

public class SequentialSearchTest {
    private SequentialSearch ss;

    @org.junit.Before
    public void Before(){
        this.ss = new SequentialSearch();
        Legocsv reader = new Legocsv();
    }

    @org.junit.Test
    public void cointains() {
        //Arrange
        LegoItem item = Legocsv.itemsArray[121];
        LegoItem[] itemArray = Legocsv.itemsArray;
        //Act
        Boolean cont = ss.SequentialSearch(Arrays.asList(itemArray), item);
        //Assert
        assertTrue(cont);
    }
}