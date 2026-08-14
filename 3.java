import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        int i;
        if(n<4)
        {
            System.out.println(0);
            return;
        }
        int d=0;
        int c=0;
             if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
           System.out.println(0);
            return;
        }
        
        for(i=0;i<n;i++)
        {
           char ch=s.charAt(i);
           if(ch>='0'&&ch<='9')
           { d++;
               
           }
           if(ch>='A'&&ch<='Z')
           { c++;
               
           }
           if(ch=='/'||ch==' ')
           {
               System.out.println(0);
               return;
           }
        }
        if(d>=1&&c>=1)
        {
             System.out.println(1);
        }
        else{
            System.out.println(0);
            
        }
        
    }
};
