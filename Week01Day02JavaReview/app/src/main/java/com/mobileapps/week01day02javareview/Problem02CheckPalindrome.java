package com.mobileapps.week01day02javareview;

public class Problem02CheckPalindrome
{

    /*
        2. Create function to check if the string is a palindrome without using string.reverse() method
            public boolean checkPalindrome(String word){};
    */

    public static void main(String[] args)
    {
        String test = "heinerenieh";

        if(checkPalindrome(test))
        {
            System.out.println(test+" is Palindrome");
        }
        else
        {
            System.out.println(test+" is not Palindrome");
        }

    }

    private static boolean checkPalindrome(String word)
    {
        boolean flag = true;
        int j = word.length();

        for(int i=0; i< word.length()/2; i++)
        {
            if(word.charAt(i) != word.charAt(j-1))
            {
                flag = false;
                break;
            }
            j--;
        }

       return flag;
    }
}
