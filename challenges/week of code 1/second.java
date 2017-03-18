import java.io.*;
import java.util.*;



class Solution {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int  n =scan.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++)
        {
          a[i] = scan.nextInt();
        }
        int min= a[0];
        int max = a[0];

        for (int i=0;i<n;i++)
        {
          if(a[i]>max)
          {
            max = a[i];
          }
          //Check if the current element of the array is smaller than m
          if(a[i]<min)
          {
            min = a[i];
          }
        }
        System.out.println();
      for (int i=0;i<n;i++)
      {
          if(a[i]==min)
          {
            a[i] = max;
          }
          else if (a[i]==max)
          {
              a[i] = min;
          }
          System.out.print(a[i]+" ");
      }
    }
}
