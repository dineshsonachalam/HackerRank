import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class solution
{
  static void part(int n,int step,int no,char m1,char m2,char w1,char w2,char g1,char g2,char l1,char l2)
  {
      if(no==1)
      {
          m2 = 'm';
          g2 = 'g';
          m1 = ' ';
          g1 = ' ';
          System.out.print(m1+""+w1+""+g1+""+l1+" ------------ "+step+" -----------> "+m2+""+w2+""+g2+""+l2);
          System.out.println();
       }
       if(no==2)
       {
            m2 = ' ';
            m1 = 'm';
            System.out.print(m1+""+w1+""+g1+""+l1+" ------------ "+step+" -----------> "+m2+""+w2+""+g2+""+l2);
            System.out.println();
       }
       if(no==3)
       {
          l1 =' ';
          m1 = ' ';
          l2 = 'l';
          m2 = 'm';
          System.out.print(m1+""+w1+""+g1+""+l1+" ------------ "+step+" -----------> "+m2+""+w2+""+g2+""+l2);
          System.out.println();
       }
       if(no==4)
       {
         m2 =' ';
         g2 =' ';
         m1 = 'm';
         g1 ='g';
         System.out.print(m1+""+w1+""+g1+""+l1+" ------------ "+step+" -----------> "+m2+""+w2+""+g2+""+l2);
         System.out.println();
       }
       if(no==5)
       {
         m2 = 'm';
         w2 = 'w';
         m1 =' ';
         w1 = ' ';
         System.out.print(m1+""+w1+""+g1+""+l1+" ------------ "+step+" -----------> "+m2+""+w2+""+g2+""+l2);
         System.out.println();
       }
       if(no==6)
       {
         m2= ' ';
         m1 = 'm';
         System.out.print(m1+""+w1+""+g1+""+l1+" ------------ "+step+" -----------> "+m2+""+w2+""+g2+""+l2);
         System.out.println();
       }
       if(no==7)
       {
         m2 = 'm';
         g2 ='g';
         m1 = ' ';
         g1 =' ';
         System.out.print(m1+""+w1+""+g1+""+l1+" ------------ "+step+" -----------> "+m2+""+w2+""+g2+""+l2);
         System.out.println();
       }
       step+=1;
       no+=1;
      n=n-1;
      if(n!=0)
      {
        part(n,step,no,m1,m2,w1,w2,g1,g2,l1,l2);
      }
  }
  public static void main(String[] args)
  {
      Scanner scan = new Scanner(System.in);
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      char m1='m',m2 =' '; //man
      char w1='w',w2=' '; //wolf
      char g1='g',g2=' '; //goat
      char l1='l',l2=' '; //leaf
      int n = 7; //possible solutions
      /*
      char a = 'a';
      char b = 'b';
      char c=' ';
      char d = 'd';
      System.out.println(a+"-"+b+"-"+c+"-"+d);
      */
    solution ob = new solution();
    /*
    int no =  ob.part(10); //function invoke
    System.out.println(no);
    */
    int step = 1;
    int no = 1;
    part(n,step,no,m1,m2,w1,w2,g1,g2,l1,l2);

    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
  }
}
