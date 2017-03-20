package india;

import java.util.Scanner;

public class sum 
{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int count=0;
		int i=0;
		System.out.println("enter num ="+num);
		if(num!=0){
			for( i=0;i<=num;i++){
				count=i+count;
			}
		}
		System.out.println(count);
		
	}
	

}
