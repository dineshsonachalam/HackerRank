import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<String> al= new ArrayList<String>();
        al.add("Ravi"); //adding object in ArrayList
        al.add("Vijay");
        al.add("John");
        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
          System.out.println(itr.next());
        }
    }
}
