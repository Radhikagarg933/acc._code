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
	    String s=sc.nextLine();
	    int i;
	    int n=s.length();
	    if(n==0)
	    { System.out.println("null");
	        return;
	    }int c=0;
	    for(i=0;i<n;i++)
	    {
	       if(s.charAt(i)=='-')
	       {
	           c++;
	       }
	    }
	    String ans="";
	   
	    for(i=0;i<c;i++)
	    {
	        ans+="-";
	    }
	    for(i=0;i<n;i++)
	    {
	        if(s.charAt(i)!='-')
	        {
	            ans+=s.charAt(i);
	        }
	    }
	      
	       
	    
	    
	    System.out.println(ans);
	
	}
}
