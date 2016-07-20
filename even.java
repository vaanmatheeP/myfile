package guvi2;

import java.util.Scanner;

public class even {
	public static void main(String args[]){
int a;
Scanner s=new Scanner(System.in);
a=s.nextInt();
System.out.println("enter the digit : ");
if(a%2==0){
	System.out.println("no is even");
}
else
{
	System.out.println("no is odd");
}

}
}