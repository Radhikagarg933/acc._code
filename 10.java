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
	    int num1=sc.nextInt();
	    int num2=sc.nextInt();
	    int sum=0;
	    int c=0;
	    int carry=0;
	    while(num1>0||num2>0)
	    {
	        int d1=num1%10;
	        int d2=num2%10;
	        sum=d1+d2+carry;
	        if(sum>9)
	        {
	            carry=1;
	            c++;
	        }
	        else{
	            carry=0;
	        }
	        num1/=10;
	        num2/=10;
	        
	    }
	    System.out.println(c);
	}
};
