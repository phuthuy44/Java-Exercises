import java.util.Scanner;

public class BuyBook{
    private static int[] a;
    private static int n;
    public static void sort()
    {
        for(int i = 1 ; i <= n ; i++ )
        {
            for(int j = i+1 ; j <= n ; j++ )
            {
                if( a[i] < a[j] )
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println(a[i] +" ");
        }
    }
    public static void main(String[] args)
    {
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[1005];//create array

        //Array
        for(int i = 1; i <= n ;i++)
        {
            a[i] = sc.nextInt();
        }
        //sapxep
        sort();
        //result
        for(int i = 1 ; i <= n ; i++ )
        {
            if( i % 3 == 0)
            {
                continue;
            }
            ans += a[i];
        }
        
        System.out.println(ans);
        sc.close();

    }
/* Input : 7 
           5 3 6 9 1 2 2
   Output : 21
 */
}