import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1;t>0;t--)
        {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            a=n-a;
            b=n-b;
            c=n-c;
            if(a==0 && b==0 && c==0)
            System.out.println(a);
            else if(a>b&&a>c)
            System.out.println(a);
            else if(b>a&&b>c)
            System.out.println(b);
            else
            System.out.println(c);            
        }
    }
}