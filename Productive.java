import java.util.*;
class Main 
{
    public static void main(String[] args) 
    { 
       // for(int i =101;i<=200;i+=2)
         //   System.out.println(i-100);
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int a = sc.nextInt();
        for(int i = 1;i<=a;i++)
        {
             int n = sc.nextInt();
             if(n>=10&&n%2==0)
             c++;
        }
        System.out.println("No. of productive days = "+c);
        sc.close();
    }
}