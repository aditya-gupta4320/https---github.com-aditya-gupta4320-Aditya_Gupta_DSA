import java.util.Scanner;
 
public class codeforces1352A 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(;n>0;n--)
            {
                int a = sc.nextInt();
                int b = a;
                int c = 0;
                int p = 0;
                for(;a>0;a/=10)
                    {
                        p = a%10;
                        if(p!=0)
                        c++;
                    }
                System.out.println(c);
            for(int i = 0; b > 0; b /= 10, i++)
            {
                p = b % 10;
                if(p != 0)
                {
                    p = p * (int)Math.pow(10, i);
                    System.out.print(p + " ");
                }
            }
            System.out.println();
            }
    }
}