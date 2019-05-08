package Bank1;

import java.util.Scanner;

public class Operation {
Account2 ac=new Account2();
Scanner sc=new Scanner(System.in);

public void CreateAccount(){
	boolean flag=true;
	while(flag){
	System.out.println("Enter your name");
	String name=sc.next();String regex="[a-z]{5}";
	if(name.matches(regex)){
		ac.setName(name);
		flag=false;
	}
	else{
		System.out.println("Invalid name");
	}
	}
}
}
