import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class solution
{
    public static void main(String[] args)
    {
        Scanner scan =  new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int h = 0;
        for (int i=0;i<n;i++)
        {
            int x = scan.nextInt();
            if(x>h)
            {
              h =x;
            }
        }
        if(k-h < 0)
        {
            //hurdle exists
            System.out.println(h-k);
        }
        else {
          System.out.println("0");
        }
    }
}
