import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        int q=scan.nextInt();
        int lastAns=0;
        List<List> seqList = new ArrayList();
        for (int i=0;i<n ;i++ )
        {
          seqList.add(new ArrayList<Integer>());
        }
        for (int i=0;i<q ;i++ )
        {
            int t=scan.nextInt();
            int x=scan.nextInt();
            int y=scan.nextInt();
            List<Integer> seq = seqList.get((x^lastAns)%n);
            if(t==1)
            {
              seq.add(y);
            }
            else
            {
              lastAns = seq.get(y%(seq.size()));
              System.out.println(lastAns);
            }
        }
        scan.close();
    }
}
