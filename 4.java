import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=sc.nextInt();
        int diff=sc.nextInt();
        int[]a=new int[n];
        
        int i;
        
        for( i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
       
        
        int c=0;
        for(i=0;i<n;i++)
        { 
            if(Math.abs(a[i]-num)<=diff)
            {
                c++;
          
                
            }
           
        }
        
       if (c == 0) {
            System.out.println(-1);
        } else {
            System.out.println(c);
        }
       
    }


};
