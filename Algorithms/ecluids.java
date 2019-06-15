//Ecluids algorithm to find gcd
/*
gcd(m,n)

  pseudo code
  while n (!=0)
{
    r=m%n;
    m=n;
    n=r;
}
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class solution
{

  int gcd(int m,int n)
  {
      if(n==0) //gcd(m,0) ==>gcd ends ==> m (is the gcd)
      {
        return m;
      }
      else
      {
          return gcd(n,m%n);
      }
  }

  int lcm(int[] a,int n)
  {
      int res =1,i;
      for (i=0;i<n;i++)
      {
          res =res*a[i]/gcd(res,a[i]);
      }
      return res;
  }


  public static void main(String[] args)
  {
      Scanner scan = new Scanner(System.in);
      //finding lcm of a no using now reduction of gcd to lcm
      int x =10;
      solution ob = new solution();

      //given an array;
      System.out.println("Enter the size of the array:");
      int n = scan.nextInt();
      System.out.println("Enter the list of elements:");
    int[] a = new int[n];

      for (int i=0;i<n;i++)
      {
          a[i] = scan.nextInt();

      }
      int result = ob.lcm(a,n);


      System.out.println("Result:"+result);


  }
}
