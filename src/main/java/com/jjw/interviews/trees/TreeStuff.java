package com.jjw.interviews.trees;

public class TreeStuff
{
    /**
     * Recursively checks each subtree of a tree to determine if it's balanced.
     * 
     * @param root The root of our tree
     * @return the height
     */
    public static int checkHeight(TreeNode root)
    {
        if (root == null)
        {
            return 0;
        }

        // check if left is balanced
        int leftHeight = checkHeight(root.getLeft());
        if (leftHeight == -1)
        {
            return -1; // Not balanced
        }

        // check if right is balanced
        int rightHeight = checkHeight(root.getRight());
        if (rightHeight == -1)
        {
            return -1; // Not balanced
        }

        // check if current node is balanced
        int heightDiff = leftHeight - rightHeight;
        if (Math.abs(heightDiff) > 1)
        {
            return -1; // Not balanced
        }
        else
        {
            // return height
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    /**
     * Utilizes our check height function to determine if a tree is balanced. In this case, a balanced tree is defined
     * to be a tree such taht the heights of the two subtrees of any node never differe by more than one.
     * 
     * @param root The root of our tree
     * @return true if it's balanced, false otherwise
     */
    public static boolean isBalanced(TreeNode root)
    {
        if (checkHeight(root) == -1)
        {
            return false;
        }
        return true;
    }
}
