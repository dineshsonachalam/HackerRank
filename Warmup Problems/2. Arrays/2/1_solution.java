import java.io.*;
import java.util.*;
class solution
{

    public static void main(String []args)
    {
          Scanner scan = new Scanner(System.in);
          int t = scan.nextInt();
          for(int z=0;z<t;z++)
          {
              int n = scan.nextInt();
              LinkedList<Integer> numbers = new LinkedList<Integer>();
              LinkedList<Integer> zeroes = new LinkedList<Integer>();
              for(int i=0;i<n;i++)
              {
                  int temp = scan.nextInt();
                  if(temp!=0)
                  {
                      numbers.add(temp);
                  }
                  else
                  {
                      zeroes.add(temp);
                  }
              }
              Iterator<Integer> nos = numbers.iterator();
              Iterator<Integer> zeros = zeroes.iterator();
              while(nos.hasNext())
              {
                  System.out.print(nos.next()+" ");
              }
              while(zeros.hasNext())
              {
                  System.out.print(zeros.next()+" ");
              }
          }
    }
}
// Time Complexity: O(n)
