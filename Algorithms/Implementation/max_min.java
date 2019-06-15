import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long[] a=new long[100000];
        long max = a[0];
        long min = a[0];
        long sum=0;

        for(int i=0;i<5;i++)
        {

            a[i] = in.nextLong();
            if(i==0)
            {
                min =a[0];
            }
            if( max < a[i])
            {
                max = a[i];
            }
            else if(min>a[i])
            {
                min = a[i];

            }
            sum+=a[i];
        }
      //   System.out.println("Min:"+min);
        //    System.out.println("Max"+max);
          //    System.out.println("Sum:"+sum);



        System.out.println((sum-max)+" "+(sum-min));




    }
}
