import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        
        int i;
        
        
        int s=0;
        int r=0;
        for(i=1;i<=m;i++)
        { 
            if(i%n==0)
            {
                s+=i;
          
                
            }
            else{
                r+=i;
            }
           
        }
        int diff=0;
        if(s>r)
        {
            diff=s-r;
        }
        else{
            diff=r-s;
        }
        System.out.println(diff);
        
    }
};
      
