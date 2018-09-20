import java.io.*;
import java.util.*;
class solution
{
    public static void move_zeroes_to_end(int[] a)
    {
        int count = 0;
        int n = a.length;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
                a[count] = a[i];
                count = count + 1;
                System.out.print(a[i]+" ");
            }
        }
        for(int i = count;i<a.length;i++)
        {
            a[i] = 0;
            System.out.print(a[i]+" ");
        }

    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int z=0;z<t;z++)
        {
            int n = scan.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i] = scan.nextInt();
            }
            move_zeroes_to_end(a);

        }
    }
}
