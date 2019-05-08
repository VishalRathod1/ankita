package Bank1;

import java.util.Scanner;

import operation.Operation;

public class Testnew {
public static void main(String args[]){
	Operation op=new Operation();
	Scanner sc=new Scanner(System.in);
	
	 System.out.println("Enter your Choice");
		int ch=sc.nextInt();
		switch(ch){
		case 1:
			op.CreateAccount();
			break;
		default:
			System.out.println("Wrong Choice");
			break;
		}
}
}
