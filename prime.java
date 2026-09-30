import java.util.*;

public class prime {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        //int n = s.nextInt();
        for(int i = 1;i<=100;i++)
        {
            int c = 0;
            for(int j = 1;j<=i;j++)
            {
                if(i%j==0)
                c++;
            }
            if(c>2)
            System.out.println("No. is composite = "+i);
        }    
        s.close();
    }
}
