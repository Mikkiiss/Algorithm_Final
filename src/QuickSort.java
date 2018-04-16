import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class QuickSort<T extends Comparable<T>> {
    //Selects a pivot as last index, positions all smaller in front of pivot, positions all higher behind pivot
    int partition(List<T> collection, int low, int high)
    {
        //Set pivot as last index
        T pivot = collection.get(high);
        int i = low - 1; // index of smaller element
        //loop through all elements smaller than the element at index "high"
        for (int j = low; j < high; j++)
        {
            // If current element is smaller than or equal to pivot
            if (collection.get(j).compareTo(pivot) <= 0)
            {
                i++;
                // swap arr[i] and arr[j]
                T temp = collection.get(i);
                collection.set(i,collection.get(j));
                collection.set(j,temp);
            }
        }
        // swap arr[i+1] and arr[high]
        T temp = collection.get(i + 1);
        collection.set(i + 1, collection.get(high));
        collection.set(high,temp);

        //Return i + 1
        return i + 1;
    }


    //Use this method to sort a generic list, the parameters are: generic array, start index of the array, end index of the array
    public List<T> QuickSort(List<T> collection, int low, int high)
    {

        //Recursively call the sort method
        //Check if the previous recursions covered the entire array by comparing low < high
        if (low < high)
        {
            //Find the partition index
            int partition = partition(collection, low, high);
            // Recursively sort elements before partition and after partition
            QuickSort(collection, low, partition - 1);
            QuickSort(collection, partition + 1, high);
        }
        //return sorted array
        return collection;
    }
}
