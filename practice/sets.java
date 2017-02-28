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

      solution ob = new solution();


      int n = scan.nextInt();
      int m =scan.nextInt();

      int[] a = new int[n]; //find lcm
      int[] b = new int[m]; //find only gcd

      for (int i=0;i<n;i++)
      {
          a[i] = scan.nextInt();
      }
      //finding lcm of the first array
      int result = ob.lcm(a,n);
      int result2=1;
      for (int i=0;i<m;i++)
      {
          int r =1;
          b[i] = scan.nextInt();
      }

      // Finding only the gcd of the second array
      int no =b[0];
      for(int i=1;i<m;i++)
      {

          no=ob.gcd(no,b[i]);

      }
      //count the no of multiples of lcm that evenly divides gcd




      //System.out.println("Results:"+result);
      //System.out.println("Result2:"+no);
      int count = 0;
      //count the no of multiples
      int f = result; //lcm
      int l = no; //gcd
      for (int i=f;i<=l;i+=f)
     {
          if(l%i==0){ count++;}
      }

      System.out.println(count);


  }
}
