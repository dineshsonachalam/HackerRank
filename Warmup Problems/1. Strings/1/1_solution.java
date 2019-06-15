import java.io.*;
import java.util.*;
class solution
{
    // O(nlgn)
    public static String sortString(String s)
    {
        char temp[] = s.toCharArray();
        // Sort the String
        Arrays.sort(temp);
        // return new sorted string
        return  new String(temp);
    }
    // O(n)
    public static Boolean CheckDuplicates(String s)
    {
        Boolean flag = true;
        int n = s.length();
        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                return false; // If string contains duplicate characters
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        s = sortString(s);
        System.out.println("Sorted String: "+s);
        Boolean flag =CheckDuplicates(s);
        if(flag == false)
        {
            System.out.println("(Contains Duplicate)->False");
        }
        else
        {
            System.out.println("(No Duplicate)->True");
        }
    }
}
// Total Time Complexity: O(n)
