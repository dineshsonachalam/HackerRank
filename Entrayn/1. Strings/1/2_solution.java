import java.io.*;
import java.util.*;
class solution
{
    public static Boolean CheckDuplicates(String s)
    {
        int n = s.length();
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(s.charAt(i) == s.charAt(j))
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        Boolean flag = CheckDuplicates(s);
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
