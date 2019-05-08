package operation;

import java.util.Scanner;

import model.Account;

public class Operation {
Account ac=new Account();
Scanner sc=new Scanner(System.in);
public void CreateAccount(){
	System.out.println("Enter your Name:");
	String name=sc.next();
	ac.setName(name);
	
	System.out.println("Enter your Address:");
	String address=sc.next();
	ac.setAddress(address);
	
	System.out.println("Enter your Mobile No:");
	long mobno=sc.nextLong();
	ac.setMobno(mobno);
	
	System.out.println("Enter your Aadhar No:");
	long aadharno=sc.nextLong();
	ac.setAadharno(aadharno);
	
	System.out.println("Enter your Balance:");
	float balance=sc.nextFloat();
	ac.setBalance(balance);
	
	System.out.println("Enter your Username:");
	String username=sc.next();
	ac.setUsername(username);
	
	System.out.println("Enter your Password:");
	long password=sc.nextLong();
	ac.setPassword(password);
	
	System.out.println("Enter your Email ID:");
	String emailid=sc.next();
	ac.setEmailid(emailid);
}

public void DisplayAccount(){
	System.out.println("Name:"+ac.getName());
	System.out.println("Address"+ac.getAddress());
}

public void DepositMoney(){
	System.out.println("Enter the amount to deposit");
	float balance=sc.nextFloat();
	float t=ac.getBalance()+balance;
	ac.setBalance(t);
	System.out.println("Your total amount is:"+t);
}

public void WithdrawMoney(){
	System.out.println("Enter the amount to withdraw");
	float balance=sc.nextFloat();
	float t=ac.getBalance()-balance;
	ac.setBalance(t);
	//System.out.println("Your total amount is:"+t);
	/*if(setBalance>balance){
	System.out.println("Your have insufficient balance");
   }
	else{
		System.out.println("Your total amount is:"+t);

	}*/
}

public void CheckBalance(){
	System.out.println("Check your Balance");
	System.out.println(ac.getBalance());

	
}

}
