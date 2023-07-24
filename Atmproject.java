package javaProgramming;

import java.util.Scanner;

public class Atmproject {
	
		float Balance;
		int PIN=1234;
		public void checkpin() {
			System.out.println("Enter your pin:");
			Scanner sc= new Scanner(System.in);
			int enteredpin=sc.nextInt();
			if(enteredpin==PIN) {
				menu();
			}else {
				System.out.println("Enter a valid pin:");
			}
		}
		public void menu() {
			System.out.println("Enter Your Choice");
			System.out.println("1. Check A/C Balance");
			System.out.println("2. Withdraw Money");
			System.out.println("3. Deposit Money");
			System.out.println("4. Exit");
			
			Scanner sc =new Scanner(System.in);
			int option = sc.nextInt();
			if(option==1) {
				checkBalance();
			}else if(option==2) {
				withdrawMoney();
			}else if(option==3) {
				depositMoney();
			}else if(option==4) {
				return;
			}else {
				System.out.println("Enter  Valid Choice:");
			}
			
		}
		public void checkBalance() {
			System.out.println("Balance: "+Balance);
			menu();
		}
		public void withdrawMoney() {
			System.out.println("Enter Amont To Withdraw:");
			Scanner sc=new Scanner(System.in);
			float amount=sc.nextFloat();
			if(amount>Balance) {
				System.out.println("Insufficient Balance");
			}else {
				Balance=Balance-amount;
				System.out.println("Money Withdrawal Successfully");
			}
			menu();
			
		}
		public void depositMoney() {
			System.out.println("Enter The Amount:");
			Scanner sc=new Scanner(System.in);
			float amount=sc.nextFloat();
			Balance=Balance+amount;
			System.out.println("Money Deposited Successfully");
			menu();
		}
	

	
		public static void main(String[] args) {
			Atmproject obj=new Atmproject();
			obj.checkpin();
			

		}

	}

	
		

	