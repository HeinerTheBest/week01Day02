package com.mobileapps.week01day02javareview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem01FindDuplicates
{
    /*
             1. Create a function to print the duplicates in a list of strings
                        public void findDuplicates(List<String> strings){};
    * */
    public static void main(String[] args)
    {
        List<String> test = new ArrayList<>();
        test.add("hola");
        test.add("bye");
        test.add("blue");
        test.add("red");
        test.add("Heiner");
        test.add("bye");
        test.add("blue");
        test.add("blue");
        test.add("blue");
        test.add("hola");

        System.out.println("Your list is \n"+test+"\n\n and the duplicates are \n"+findDuplicates(test));
    }

    private static Set<String> findDuplicates(List<String> strings)
    {
      String aux;
      boolean flag = false;
      Set<String> duplicates = new HashSet<>();

      for(int i=0 ; i<strings.size()-1 ; i++)
      {
          aux= strings.get(i);
          for(int j=i+1; j<strings.size();j++)
          {
             if( aux.equals(strings.get(j)))
             {
                 flag = true;
             }
          }
          if(flag)
          {
              duplicates.add(aux);
              flag = false;
          }
      }
      return duplicates;
    }

}
