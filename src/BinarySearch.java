import java.util.Collection;
import java.util.List;

public class BinarySearch<T extends Comparable<T>>
{
    //Parameters: Generic comparable SORTED list, and an element of the array
    public boolean BinarySearch(List<T> collection, T item)
    {

        //For the first loop set the start and end of the array leave them as is
        int start = 0;
        int end = collection.size() - 1;
        //Loops entire array until the end or the item is found
        while (start <= end)
        {
            //Set the mid of the array
            int mid = start + (end - 1) / 2;
            //If the mid is equal to the value we want to find, return true.
            if (collection.get(mid).compareTo(item) == 0)
            {
                return true;
            }
            //Otherwise find in which half of the array the item we want to find lies and adjust the parameters accordingly
            if (collection.get(mid).compareTo(item) > 0)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        //If the item was not found in the array, return false
        return false;
    }
}