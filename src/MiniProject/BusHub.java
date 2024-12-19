package MiniProject;
import java.util.*;

public class BusHub extends BusAdmin {
	
	static double drop=500;




	public void InvestAmount() {
		super.InvestAmount(amount);
	}
	
	
	public void first(double in) {
		System.out.println("amount is credit "+in);
		double balance = in-=drop;
		System.out.println("balance amount is : "+ balance);
	}
	
	public void second(double add) {
		System.out.println("Second person Successfully Credit "+ add);
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BusHub obj = new BusHub();
		
		int userid = 12345;
		String userpass= "abcd12";
		System.out.println("Enter \"ID\" and \"Password\"");
		int id = scan.nextInt();
		String pass = scan.next();
		if((userid == id) && (userpass.equals(pass))) {
			System.out.println("Password and Id Matched");
			
			String userok = "view";
			System.out.println("Enter \"View\" to show amount");
			String ok = scan.next();
			if((userok.equals(ok))) {
				obj.InvestAmount();
				System.out.println(amount);
				
				System.out.println("Enter the amount to add the persons");
			for(int i=0;i<2;i++) {
				double add = scan.nextDouble();
				double add2 = scan.nextDouble();
				amount-=add;
				amount-=add2;
			
				obj.first(add);
				obj.second(add2);
				System.out.println("Balnce amount is  : "+ amount);
				int choice = scan.nextInt();
				switch(choice) {
				
				case 1:
				System.out.println("Enter how many seats you booking");
				int members = scan.nextInt();
				double total = drop*=members;
				obj.first(total);
				}
				
				
			}
			}
		}
		else {
			System.out.println("Id and Password is Wrong");
		}
		
	System.out.println();	
		
	}
}
