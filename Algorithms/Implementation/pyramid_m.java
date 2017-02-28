import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Solution
{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    int n =scan.nextInt();//size of  pyramid
    int blank = n+2;
    int odd =3;
    for(int i=0;i<n;i++)
    {
        if(i==0)
        {
            for (int j=0;j<blank;j++)
            {
                System.out.print(" "); //no println
            }
            System.out.print("1");
            System.out.println();
            blank-=2;
        }
          else if(i>0)
          {
            for (int j=0;j<blank;j++)
            {
                System.out.print(" "); //no println
            }
            blank-=2; //deleting white spaces
            for (int l=0;l<odd;l++)
            {
                int no  = l+1;
                System.out.print(no+" ");
            }
            System.out.println();
            odd+=2;
          }

    }
          blank +=4;
          odd-=4;
          int m = n-1; //mirror pyramid size
          for (int j = 0;j<m ;j++ )
          {
              for (int k=0;k<blank;k++)
              {
                  System.out.print(" ");
              }
              blank+=2;
              for (int l=0;l<odd;l++)
              {
                  int no  = l+1;
                  System.out.print(no+" ");
              }
              odd-=2;
              System.out.println();
          }
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
  }
}
