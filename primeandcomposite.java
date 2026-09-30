import java.util.Scanner;
public class primeandcomposite {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b=0;
        int c=0;
        for(;n>0;n/=10)
        {
            int count=0;
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                count++;
            }
            if(count==2)
            b++;    
            else
            c++;
        }
        System.out.println("Prime digits = "+b);
        System.out.println("Composite digits = "+c);
        sc.close();
    }
}

