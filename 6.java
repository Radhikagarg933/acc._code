import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     
        int n=sc.nextInt();
         int[]a=new int[n];
        
        int i;
        
        for( i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if(n==0||n<3)
        {
            System.out.println(0);
            return;
        }
        int max=a[0];
           int s_max=a[0];
           int min=a[0];
           int s_min=a[0];
           
        for(i=0;i<n;i++)
         {
                
            
       if(i%2==0)
       {
           
          
           
               if(a[i]>max)
               { s_max=max;
                   max=a[i];
                   
               }
               else if(a[i]>s_max&&a[i]!=max)
               {
                   s_max=a[i];
               }
           }
       
       else{
          
           
               if(a[i]<min)
               {
                   s_min=min;
                   min=a[i];
                 
               }
               else if(a[i]<s_min&&a[i]!=min)
               {
                   s_min=a[i];
               }
           }
          
       }
       int sum=s_max+s_min;
       System.out.println(sum);
        
    }
};
