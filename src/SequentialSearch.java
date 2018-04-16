import java.util.Collection;

public class SequentialSearch<T extends Comparable<T>> {
    //Parameters are a generic list, and item to be found in the array
    public boolean SequentialSearch(Collection<T> collection, T item) {
        //Loop through the array, if the item is found return true otherwise return false
        for (T currentItem:collection) {
            if(currentItem.compareTo(item) == 0){
                return true;
            }
        }
        return false;
    }
}