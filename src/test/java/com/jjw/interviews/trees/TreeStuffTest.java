package com.jjw.interviews.trees;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TreeStuffTest
{
    /** @formatter:off */
    /**
     *               10
     *              5  15
     *             4
     *            3
     *           2
     */
   /** @formatter:on */
    @Test
    public void testIsBalancedFalse()
    {
        // root setup
        TreeNode treeNodeRoot = new TreeNode(new Integer(10));
        TreeNode leftTreeNode = new TreeNode(new Integer((5)));
        TreeNode rightTreeNode = new TreeNode(new Integer((15)));

        // set root left and right
        leftTreeNode.setLeft(new TreeNode(new Integer(4)));
        leftTreeNode.getLeft().setLeft(new TreeNode(new Integer(3)));
        leftTreeNode.getLeft().getLeft().setLeft(new TreeNode(new Integer(2)));
        treeNodeRoot.setLeft(leftTreeNode);
        treeNodeRoot.setRight(rightTreeNode);

        boolean isBalanced = TreeStuff.isBalanced(treeNodeRoot);
        assertFalse(isBalanced);
    }

    /** @formatter:off */
    /**
     *             10
     *           5    15
     *         3  6  11 16
     */
    /** @formatter:on */
    @Test
    public void testIsBalancedTrue()
    {
        // root setup
        TreeNode treeNodeRoot = new TreeNode(new Integer(10));
        TreeNode leftTreeNode = new TreeNode(new Integer((5)));
        TreeNode rightTreeNode = new TreeNode(new Integer((15)));

        // set root left and right
        leftTreeNode.setLeft(new TreeNode(new Integer(3)));
        leftTreeNode.setRight(new TreeNode(new Integer(6)));
        rightTreeNode.setLeft(new TreeNode(new Integer(11)));
        rightTreeNode.setRight(new TreeNode(new Integer(16)));
        treeNodeRoot.setLeft(leftTreeNode);
        treeNodeRoot.setRight(rightTreeNode);

        boolean isBalanced = TreeStuff.isBalanced(treeNodeRoot);
        assertTrue(isBalanced);
    }

    /** @formatter:off */
    /**
     *               10
     *              5  15
     *             4
     *            3
     *           2
     */
   /** @formatter:on */
    @Test
    public void testIsBalancedSlowerFalse()
    {
        // root setup
        TreeNode treeNodeRoot = new TreeNode(new Integer(10));
        TreeNode leftTreeNode = new TreeNode(new Integer((5)));
        TreeNode rightTreeNode = new TreeNode(new Integer((15)));

        // set root left and right
        leftTreeNode.setLeft(new TreeNode(new Integer(4)));
        leftTreeNode.getLeft().setLeft(new TreeNode(new Integer(3)));
        leftTreeNode.getLeft().getLeft().setLeft(new TreeNode(new Integer(2)));
        treeNodeRoot.setLeft(leftTreeNode);
        treeNodeRoot.setRight(rightTreeNode);

        boolean isBalanced = TreeStuff.isBalancedSlower(treeNodeRoot);
        assertFalse(isBalanced);
    }

    /** @formatter:off */
    /**
     *             10
     *           5    15
     *         3  6  11 16
     */
    /** @formatter:on */
    @Test
    public void testIsBalancedSlowerTrue()
    {
        // root setup
        TreeNode treeNodeRoot = new TreeNode(new Integer(10));
        TreeNode leftTreeNode = new TreeNode(new Integer((5)));
        TreeNode rightTreeNode = new TreeNode(new Integer((15)));

        // set root left and right
        leftTreeNode.setLeft(new TreeNode(new Integer(3)));
        leftTreeNode.setRight(new TreeNode(new Integer(6)));
        rightTreeNode.setLeft(new TreeNode(new Integer(11)));
        rightTreeNode.setRight(new TreeNode(new Integer(16)));
        treeNodeRoot.setLeft(leftTreeNode);
        treeNodeRoot.setRight(rightTreeNode);

        boolean isBalanced = TreeStuff.isBalancedSlower(treeNodeRoot);
        assertTrue(isBalanced);
    }

    /** @formatter:off */
   /**
    *             10
    *           5    15
    *         3  6  11 16
    */
   /** @formatter:on */
    @Test
    public void testMaxValue()
    {
        // root setup
        TreeNode treeNodeRoot = new TreeNode(new Integer(10));
        TreeNode leftTreeNode = new TreeNode(new Integer((5)));
        TreeNode rightTreeNode = new TreeNode(new Integer((15)));

        // set root left and right
        leftTreeNode.setLeft(new TreeNode(new Integer(3)));
        leftTreeNode.setRight(new TreeNode(new Integer(6)));
        rightTreeNode.setLeft(new TreeNode(new Integer(11)));
        rightTreeNode.setRight(new TreeNode(new Integer(16)));
        treeNodeRoot.setLeft(leftTreeNode);
        treeNodeRoot.setRight(rightTreeNode);

        Integer maxTraversal = TreeStuff.maxValue(treeNodeRoot);
        System.out.println(maxTraversal);
    }

}
