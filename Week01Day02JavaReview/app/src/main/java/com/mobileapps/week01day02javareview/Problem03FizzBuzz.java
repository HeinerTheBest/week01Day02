package com.mobileapps.week01day02javareview;

public class Problem03FizzBuzz
{

    /*
    3. Create a function that will print:
           "fizz" is the number is divisible by 3
           "buzz" is the number is divisible by 5
           "fizzbuzz" is the number is divisible by both
     */

    public static void main(String[] args) {
        int number = 15;

        System.out.println("For the number "+number);
        switch (fizzbuzz(number))
        {
            case 1:
                System.out.println("fizz");
                break;

            case 2:
                System.out.println("buzz");
                break;

            case 3:
                System.out.println("fizzbuzz");
                break;

            default:
                System.out.println("nothing");
        }

    }

    static private int fizzbuzz(int n)
    {
        if(n%3 == 0 && n%5 == 0)
        {
            return 3;
        }
        else if (n%3 == 0)
        {
            return 1;
        }
        else if (n%5 == 0)
        {
            return 2;
        }

        return 0;
    }

}
