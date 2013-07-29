package com.jjw.interviews;

public class InterviewCode
{
    /**
     * Assumes ASCII character set (0-255)
     * 
     * @param str
     *            A String of ASCII characters
     * @return true if all of the characters in the String are unique
     */
    public boolean isUniqueChars(String str)
    {
        if (str.length() > 256)
        {
            return false;
        }

        boolean[] charArray = new boolean[256];
        for (int i = 0; i < str.length(); i++)
        {
            int val = str.charAt(i);
            if (charArray[val])
            {
                // Already hit that character
                return false;
            }
            charArray[val] = true;
        }
        return true;
    }

    /**
     * Given an image represented by an N*N matrix where each pixel in the image is 4 bytes, write a method to rotate
     * the image by ninetydegrees. Can you do this in place?
     * 
     * @param matrix
     * @param n
     */
    public int[][] rotate(int[][] matrix, int n)
    {
        for (int layer = 0; layer < n / 2; layer++)
        {
            int first = layer;
            int last = n - 1 - layer;
            System.out.println("first: " + first);
            System.out.println("last: " + last);
            for (int i = first; i < last; i++)
            {
                int offset = i - first;
                int top = matrix[first][i]; // save top
                matrix[first][i] = matrix[last - offset][first]; // left -> top
                matrix[last - offset][first] = matrix[last][last - offset]; // bottom - > left
                matrix[last][last - offset] = matrix[i][last]; // right -> bottom
                matrix[i][last] = top; // top -> right
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Main entry point of the application
     * 
     * @param args
     */
    public static void main(String[] args)
    {
        InterviewCode interviewCode = new InterviewCode();

        System.out.println(interviewCode.isUniqueChars("123ABCDEAFG"));

        int[][] matrix = new int[5][5];
        matrix[0][1] = 1;
        matrix[1][0] = 2;
        matrix[2][3] = 5;
        System.out.println("Original:");
        printMatrix(matrix);
        System.out.println("Rotated 90 degress:");
        printMatrix(interviewCode.rotate(matrix, matrix.length));
    }
}
