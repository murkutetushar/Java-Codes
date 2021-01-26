package com.ui;
import com.utility.*;
import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		//Fill the UI code
		Bazaar pb = new Bazaar();
		System.out.println("Enter the no of Policy names you want to store");
		String noOfPolicy1 =sc.nextLine();
		String a = noOfPolicy1.replaceAll("\\s", "");
		int noOfPolicy = Integer.parseInt(a);
		for(int i=0;i<noOfPolicy;i++) {
			System.out.println("Enter the Policy ID");
			int policyId =Integer.parseInt(sc.nextLine());
			System.out.println("Enter the Policy Name");
			String policyName = sc.nextLine();	
		    pb.addPolicyDetails(policyId, policyName);
		}
		
		for (int key: pb.getPolicyMap().keySet()) {
			System.out.println(key+" "+pb.getPolicyMap().get(key));
		}
		
		System.out.println("Enter the policy type to be searched");
		String policyType = sc.nextLine();
		List<Integer> list = pb.searchBasedOnPolicyType(policyType);
		for (int integer : list) {
			System.out.println(integer);	
		}
		
		
	

	}

}
