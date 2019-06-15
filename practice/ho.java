import java.io.*;
import java.util.*;

class solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan =  new Scanner(System.in);
        int i = scan.nextInt();
        int j = scan.nextInt();
        int k = scan.nextInt();
        int n = j-i;
        int count = 0;
        //find the reverse of a given no



        for(int x =0;x<=n;x++)
        {
            int reverse =0;
            int no = i;

            while(no!=0)
            {
              reverse = reverse * 10;
              reverse = reverse + no%10;
              no = no/10;
            }

                int dif = reverse-i;
                if(dif<0)
                {
                  dif = dif*-1;
                }
            if(dif%k==0)
            {
                count++;
            }
        //    System.out.println(dif);

           i++;

        }
        System.out.println(count);

    }
}
