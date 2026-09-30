import java.util.*;
public class numberfindinarray 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int s = a.length;
        for(int i=0;i<s;i++)
        a[i] = sc.nextInt();
        System.out.print("Enter the number to find: ");
        int num = sc.nextInt();
        int c = 0;
        for(int i=0;i<s;i++)
        {
            if(a[i] == num)
            {
                System.out.println("Number found at index: " + i);
                c++;
                break;
            }
        }
        if(c == 0)
        System.out.println("Number not found");
    }
}
