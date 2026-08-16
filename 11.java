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
	   int mod=100000007;
	   int n=((num1*(num1+1))/2)+1;
	   int ans=n%mod;
	   
	    System.out.println(ans);
	}
};
