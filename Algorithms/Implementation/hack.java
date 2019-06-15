import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class solution
{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int  n =scan.nextInt();
    int[] max = new int[n];
    int[] a = new int[n];
    int[] p = new int[n];
    for (int i =1 ;i<=n ;i++ )
    {
       a[i] =scan.nextInt();
       p[i] =scan.nextInt();
    }
    int sum =0;
    for (int i=1;i<=n-1;i++)
    {
        for (int j = i+1;j<=n ;j++)
        {
          int d =abs.(p[i]-p[j]);
          if (a[i]>a[j])
          {
              max[i] = a[i];
          }
          else
          {
             max[i] = a[j];
          }
          int sum+=(d*max[i]);
          break;
        }
        if(i==n-1)
        {
          Arrays.sort(max);
          int diff = p[i]-p[j];
          int max[i+1] = max[i];
        }
    }

  }
}
