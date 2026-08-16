/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.


*******************************************************************************/
import java.util.Scanner;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int i;
	    int [] a = new int[n];
	    for(i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    int s=sc.nextInt();
	    Arrays.sort(a);

	    int p=0;
	    if(n<2){
	          System.out.println(-1);
	          return ;
	    }
	    for(i=0;i<n;i++)
	    {
	        
	        if(a[i]+a[i+1]<=s)
	        {
	             p=a[i]*a[i+1];
	            break;
	        }
	    }
	    
	    
	    System.out.println(p);
	
	}
}
