import java.io.*;
import java.util.*;
class solution
{
    public static boolean sum_is_Equal(int[] a,int sum)
    {
        int n = a.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]+a[j]==sum)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt(); // Test cases
        for(int z=0;z<t;z++)
        {
            int n = scan.nextInt();
            int sum = scan.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i] = scan.nextInt();
            }
            boolean result = sum_is_Equal(a,sum);
            if(result == true)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}
// Time complexity: O(n^2)
