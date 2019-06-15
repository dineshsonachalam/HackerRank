import java.io.*;
import java.util.*;
class solution
{
  public static void main(String[] args)
  {
      Scanner scan = new Scanner(System.in);
      long sum = 0;
      long max = 0;
      long min = 10000000;
      int count = 0;
      while(count<5)
      {
        long n = scan.nextLong();
        sum+=n;
        if(min>n)
        {
          min = n; //for finding the minimum element
        }
        else if(max < n)
        {
          max = n; //for finding the maximum element
        }
        count++;
      }
      scan.close();
      System.out.println((sum-min)+" "+(sum-max)); //for displaying the maximum and minimum elements
  }
}
