import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class  solution
{
  public static void main(String[] args)
  {
      Scanner scan = new Scanner(System.in);
      int d1 = scan.nextInt();
      int m1 = scan.nextInt();
      int y1 = scan.nextInt();
      int d2 = scan.nextInt();
      int m2 = scan.nextInt();
      int y2 = scan.nextInt();
      int fine = 0;
      if((d1<=d2) && (m1<=m2) && (y1<=y2))
      {
        fine = 0;
      }
      else if ((d1>d2) && (m1==m2) && (y1==y2))
      {
        int x = d1-d2;
        if(x<0)
        {
          x =x*-1;
        }
        fine = 15*x;

      }
      else if ( (m1>m2) && (y1==y2) )
      {
          int x = m1-m2;
          if(x<0)
          {
            x = x*-1;
          }
          fine = 500*x;
      }
      else if(y1>y2)
      {
        fine = 10000;
      }
      System.out.println(fine);
  }
}
