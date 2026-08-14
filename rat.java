import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int unit=sc.nextInt();
        int r=sc.nextInt();
        int[]a=new int[n];
        
        int i;
        
        for( i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if(n==0)System.out.println(-1);
        int sum=0;
        int t=r*unit;
        int c=0;
        for(i=0;i<n;i++)
        { c++;
            sum=sum+a[i];
            if(sum>=t)
            {
                break;
            }
        }
        
        
         if (sum < t) {
            System.out.println(0);
        } else {
            System.out.println(c);
        }

}
}
