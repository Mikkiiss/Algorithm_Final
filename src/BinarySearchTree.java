public class BinarySearchTree<T extends Comparable<T>>
{
    //Declare the root node
    public static Node root;
    //When initiated set root node to null
    public BinarySearchTree()
    {
        root = null;
    }
    //Insert node
    public boolean insert(Node node)
    {
        //if no root present, set node as root
        if(root == null)
        {
            root = node;
            return true;
        }
        //else find a spot for the node
        else
        {
            //Declare currentnode and initiate as root
            Node currentnode = root;
            //Run loop until a place for the node is found
            while(true)
            {
                //if node already exists return true
                if(node.getData().compareTo(currentnode.getData()) == 0)
                {
                    return true;
                }
                //if data of node is bigger than current node get the node to its right
                else if(node.getData().compareTo(currentnode.getData()) > 0)
                {
                    //if node is null insert the new node
                    if(currentnode.getRight() == null)
                    {
                        currentnode.setRight(node);
                        //If space for the node is found, return true
                        return true;
                    }
                    //else change current node to its right node
                    else
                    {
                        currentnode = currentnode.getRight();
                    }
                }
                //if data of node is smaller than current node get the node to its left
                else if(node.getData().compareTo(currentnode.getData()) < 0)
                {
                    //if node null insert the new node
                    if(currentnode.getLeft() == null)
                    {
                        currentnode.setLeft(node);
                        //If space for the node is found, return true
                        return true;
                    }
                    //else change current node to its left node
                    else
                    {
                        currentnode = currentnode.getLeft();
                    }
                }

            }
        }
    }
    //Find a specific node in the tree
    public boolean findNode(Node node)
    {
        //Declare currentnode and initiate as root
        Node currentnode = root;
        //Run loop until the node is found
        while(true)
        {
            //if data of currentnode is equal to the one provided return true
            if(node.getData() == currentnode.getData())
            {
                //If space for the node is found, return true
                return true;
            }
            //if data is bigger go to its right
            else if(node.getData().compareTo(currentnode.getData()) > 0)
            {
                //if node null return false
                if(currentnode.getRight() == null)
                {
                    return false;
                }
                //else set currentnode to its right
                else
                {
                    currentnode = currentnode.getRight();
                }
            }
            //if data is smaller go to its left
            else if(node.getData().compareTo(currentnode.getData()) < 0)
            {
                //if node null return false
                if(currentnode.getLeft() == null)
                {
                    return false;
                }
                //else set currentnode to its left
                else
                {
                    currentnode = currentnode.getLeft();
                }
            }
        }
    }
    //Find a specific value in tree
    public Node findinNodes(T value)
    {
        //Declare currentnode and initiate as root
        Node currentnode = root;
        //Run loop until the value is found
        while(true)
        {
            //if data of currentnode is equal to the value provided return true
            if(currentnode.getData().compareTo(value) == 0)
            {
                return currentnode;
            }
            //if data is bigger go to its right node
            else if(currentnode.getData().compareTo(value) < 0)
            {
                //if node is null return null
                if(currentnode.getRight() == null)
                {
                    return null;
                }
                //else set currentnode to its right
                else
                {
                    currentnode = currentnode.getRight();
                }
            }
            //if data is smaller go to its left node
            else if(currentnode.getData().compareTo(value) > 0)
            {
                //if node null return null
                if(currentnode.getLeft() == null)
                {
                    return null;
                }
                //else set currentnode to its left node
                else
                {
                    currentnode = currentnode.getLeft();
                }
            }

        }
    }
    //Returns size of the tree
    public int size()
    {
        return(size(root));
    }
    //Calculate size of the tree starting from the inputted node
    private int size(Node node)
    {
        //if node null return 0
        if (node == null) return(0);
        //else check the size of left and right and add one to count the node
        else
        {
            return(size(node.getLeft()) + 1 + size(node.getRight()));
        }
    }
}
//Node class
class Node<T extends Comparable<T>>{
    private T value;
    //Node to the left of this instance
    private Node left;
    //Node to the right of this instance
    private Node right;
    //Constructor
    public Node(T value){
        this.value = value;
        left = null;
        right = null;
    }
    //Get and set for all fields
    public T getData(){
        return value;
    }
    public Node getLeft(){
        return left;
    }
    public Node getRight(){
        return right;
    }
    public void setRight(Node node){
        right = node;
    }
    public void setLeft(Node node){
        left = node;
    }
}

