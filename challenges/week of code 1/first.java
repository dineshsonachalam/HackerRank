//  Problem URL:https://www.hackerrank.com/contests/w30/challenges/candy-replenishing-robot
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int t = scan.nextInt();
      int[] a = new int[t];
      for(int i=0;i<t;i++)
      {
        a[i] = scan.nextInt();
      }
      int added = 0; //total balls added
      int x = n;
      for(int i=0;i<t;i++)
      {
        x= x-a[i];
        if( (x<5) && (i!=t-1) )
        {
          added += n-x;

          x = n;
        }
      }
  System.out.println(added);
    }
}
