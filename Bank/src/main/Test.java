package main;

import java.util.Scanner;

import operation.Operation;

public class Test {
public static void main(String[] args) {
	System.out.println("1.Create Account");
	System.out.println("2.Display Account");
	System.out.println("3.Deposit Money");
	System.out.println("4.Withdraw Money");
	System.out.println("5.Check Balance");
	System.out.println("6.Exit");
	
	Operation op=new Operation();
	Scanner sc=new Scanner(System.in);
	while(true){
    System.out.println("Enter your Choice");
	int ch=sc.nextInt();
	
	switch(ch){
	case 1:
		op.CreateAccount();
		break;
	case 2:
		op.DisplayAccount();
		break;
	case 3:
		op.DepositMoney();
		break;
	case 4:
		op.WithdrawMoney();
		break;
	case 5:
		op.CheckBalance();
		break;
	case 6:
		System.exit(0);;
		break;
	default:
		System.out.println("Wrong Choice");
		break;
	}
	}

}
}
