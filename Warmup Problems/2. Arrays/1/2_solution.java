import java.io.*;
import java.util.*;
class solution
{
    public static boolean sum_is_Equal(int[] a,int sum)
    {
         // 1. Initialize an empty hashtable h
         HashSet<Integer> h = new HashSet<Integer>();
         // 2. For each element in a[i] in a
         for(int i=0;i<a.length;i++)
         {
            // (i) find the difference between sum and a[i]
            int diff = sum - a[i];
            // (ii) check diff>0 && h.contains(diff) == true -> return yes
            if(diff>=0 && h.contains(diff))
            {
                return true;
            }
            h.add(a[i]);
         }
         return false;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
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
// Time Complexity: O(n)
