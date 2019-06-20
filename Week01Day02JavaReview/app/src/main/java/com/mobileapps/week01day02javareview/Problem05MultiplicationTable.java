package com.mobileapps.week01day02javareview;

public class Problem05MultiplicationTable
{
    /*
    5. Print a multiplication table from 1 to 10 using  multidimensional array
       Output
       1 2 3 4 5 6 7 8 9 10
       2 4 6 8 10 12 14 16 18 20
        ...
            public void printTables(){};

     */
    public static void main(String[] args)
    {
        printTables();
    }

    static private void printTables()
    {
        int[][] multTable = new int[10][10];
        for (int i=0; i<10 ; i++)
        {
            for (int j=0; j<10 ; j++)
            {
                multTable[i][j] = (i+1) * (j+1);
            }
        }

        for (int i = 0; i<10; i++)
        {
            for (int j = 0; j<10; j++)
            {
                System.out.print(multTable[i][j]+" ");
            }
            System.out.println();
        }
    }
}
