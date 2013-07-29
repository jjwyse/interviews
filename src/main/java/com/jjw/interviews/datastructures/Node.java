package com.jjw.interviews.datastructures;

public class Node
{
    private Node myLeft;
    private Node myRight;
    private Integer myValue;

    public Node(Integer value)
    {
        myValue = value;
    }

    /**
     * @return the left
     */
    public Node getLeft()
    {
        return myLeft;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(Node left)
    {
        myLeft = left;
    }

    /**
     * @return the right
     */
    public Node getRight()
    {
        return myRight;
    }

    /**
     * @param right the right to set
     */
    public void setRight(Node right)
    {
        myRight = right;
    }

    /**
     * @return the value
     */
    public Integer getValue()
    {
        return myValue;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Integer value)
    {
        myValue = value;
    }
}
