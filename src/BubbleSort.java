import java.util.Collection;
import java.util.List;

public class BubbleSort<T extends Comparable<T>>
{
    //Parameter is a generic list
    public List<T> BubbleSort(List<T> collection)
    {

        //Go through entire array
        for (int i = 0; i < collection.size(); i++)
        {
            //Go through array until j is equal to length - i - 1, excluding already sorted items(amount of items = i) at the end
            for (int j = 0; j < collection.size() - i - 1; j++)
            {
                //If the current item is bigger than the next
                if (collection.get(j).compareTo(collection.get(j + 1)) > 0)
                {
                    //Switch the places of the items
                    T temp = collection.get(j + 1);
                    collection.set(j + 1,collection.get(j));
                    collection.set(j,temp);
                }
            }
        }
        //Return sorted array
        return collection;
    }
}
