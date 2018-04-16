import java.util.Collection;
import java.util.List;

class InsertionSort<T extends Comparable<T>>
{
    //Function to sort a generic list using insertion sort
    public List<T> InsertionSort(List<T> collection)
    {

        //Loop through the entire array
        for (int i = 1; i < collection.size(); ++i)
        {
            //Set current item as key
            T key = collection.get(i);
            //Declare and set j as i-1
            int j = i - 1;
            //Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && collection.get(j).compareTo(key) > 0)
            {
                collection.set(j + 1, collection.get(j));
                //Decrease j by 1
                j = j - 1;
            }
            //Insert object
            collection.set(j + 1 , key);
        }
        //Return sorted array
        return collection;
    }
}