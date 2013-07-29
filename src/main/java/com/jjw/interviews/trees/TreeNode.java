package com.jjw.interviews.trees;

public class TreeNode<SomeNumber extends Integer>
{
   private TreeNode myLeft;
   private TreeNode myRight;
   private SomeNumber myValue;

   public TreeNode(SomeNumber o)
   {
      myValue = o;
   }

   /**
    * @return the left
    */
   public TreeNode getLeft()
   {
      return myLeft;
   }

   /**
    * @param left the left to set
    */
   public void setLeft(TreeNode left)
   {
      myLeft = left;
   }

   /**
    * @return the right
    */
   public TreeNode getRight()
   {
      return myRight;
   }

   /**
    * @param right the right to set
    */
   public void setRight(TreeNode right)
   {
      myRight = right;
   }

   /**
    * @return the value
    */
   public SomeNumber getValue()
   {
      return myValue;
   }

   /**
    * @param value the value to set
    */
   public void setValue(SomeNumber value)
   {
      myValue = value;
   }
}
