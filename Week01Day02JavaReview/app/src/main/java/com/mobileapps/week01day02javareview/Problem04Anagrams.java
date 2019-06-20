package com.mobileapps.week01day02javareview;

public class Problem04Anagrams
{

    /*
    4.  Create a function to check if the two strings are Anagrams:
     Eg COAT and TACO would be anagrams
            public boolean checkAnagrams(String word1, String word2){};
     */
    public static void main(String[] args)
    {
        String word01 = "TACO";
        String word02 = "COAT";

        System.out.println(word01+" and "+word02);

        if(checkAnagrams(word01,word02))
            System.out.println("are Anagrams");
        else
            System.out.println("are not Anagrama");

    }

    private static boolean checkAnagrams(String word1, String word2)
    {
     int num =0;

     if(word1.length() != word2.length())
         return false;

     for (int i=0; i<word1.length() ; i++)
     {
         for(int j = 0; j<word2.length() ; j++)
         {
             if(word1.charAt(i)==word2.charAt(j))
             {
                 num++;
                 break;
             }
         }
     }
        return num == word1.length();

    }
}
