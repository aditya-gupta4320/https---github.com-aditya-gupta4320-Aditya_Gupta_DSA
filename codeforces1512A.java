import java.util.*;
public class codeforces1512A
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a [];
        for(int i =0;i<t;i++)
        {
            int n = sc.nextInt();
            a = new int[n];
            int c = 0;
            for(int j =0;j<n;j++)
            a[j] = sc.nextInt();
            if(a[0]==a[1])
            c = a[1];
            else
            c = a[2];
            for(int j =0;j<n;j++)
            {
                if(c!=a[j])
                System.out.println(j+1);
            }
        }
    }
}