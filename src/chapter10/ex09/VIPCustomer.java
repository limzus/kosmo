package chapter10.ex09;

public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	VIPCustomer(){
		customerGrade = "VIP";
		bonus Ratio = 0.05;
		bonusPoint = 10;
	}

VIPCustomer(int customerID, String customerName, int agentID){
	super(customerID, customerName);
	customerGrade = "VIP";
	bonusRatio = 0.05;
	bonusPoint = 10;
	
}
	
}
