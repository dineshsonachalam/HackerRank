import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class solution
{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] a = new int[26];

    for(int i=0;i<26;i++)
    {

      a[i]=scan.nextInt(); //heights

    }
    String s =scan.next();
    char[] b = new char[26];
    int b_count = 0;
    for (int i=97;i<=122 ;i++)
    {
        char o =(char) i; //type conversion
        b[b_count] = o;
      //  System.out.println(b[b_count]);
        b_count++;

    }
    char[] c = new char[s.length()]; //string char
    for (int i=0;i<s.length();i++)
    {
        c[i] =s.charAt(i);
    //    System.out.println("char:"+c[i]);
    }
    int[] h = new int[s.length()];
    int count =0;
    for (int i=0;i<26;i++ )
    {
        for (int j=0;j<s.length() ;j++ )
        {
          //  System.out.println("C->"+c[j]);
            if(c[j] == b[i])
            {
        //      System.out.println("char: "+b[i]);
              h[count] = a[i];
              count++;
            }

        }
    }
    Arrays.sort(h);
    /*
    for (int i=0;i<s.length() ;i++ )
    {
        System.out.println("Heights: "+h[i]);
    }
    */
    int max =h[count-1];
  max = max * s.length();
  System.out.println(max);
  }
}
