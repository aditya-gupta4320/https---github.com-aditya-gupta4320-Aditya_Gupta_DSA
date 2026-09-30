import java.util.Scanner;
public class codeforces160A
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        arr[i] = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int b = n-2;
        for(int i=0;i<n;i++)
        {
            int c = 0;
            int s = 0;
            int s1 =0;
            for(int j=n-1;j>b;j--)
            {
                s = s + arr[j];
                c++;
            }
            for(int j =0;j<=b;j++)
            s1 = s1 + arr[j];
            b--;
            if(s>s1)
            {
                System.out.println(c);
                break;
            }
        }
    }
}