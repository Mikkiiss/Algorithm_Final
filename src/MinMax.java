import java.util.Collection;
import java.util.List;

public class MinMax<T extends Comparable<T>>
{
    //Declare fields
    public T min;
    public T max;
    //Parameter is a generic list
    public void MinMax(List<T> collection)
    {

        //initialize min and max variables to be the first object of the array
        this.min = collection.get(0);
        this.max = collection.get(0);
        //Loop through the entire array
        for (int i = 1; i < collection.size(); i++)
        {
            //If the current item is smaller than min, set min as current item
            if(collection.get(i).compareTo(this.min) < 0)
            {
                this.min = collection.get(i);
            }
            //If the current item is bigger than min, set max as current item
            if(collection.get(i).compareTo(this.max) > 0)
            {
                this.max = collection.get(i);
            }
        }
    }
    //Get for min and max
    public T getMin() {
        return min;
    }

    public T getMax() {
        return max;
    }
}
