import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Contact contact;
		PhoneBook phoneBook = new  PhoneBook();
		int ch;
		do {
		System.out.println("Menu");
		System.out.println("1.Add Contact \n2.Display all contacts \n3.Search contact by phone \n4.Remove contact \n5.Exit"); 
		ch = Integer.parseInt(sc.nextLine());
		switch(ch) {
		
		case 1: 
			System.out.println("Enter the First Name:");
			String fName = sc.nextLine();
			
			System.out.println("Enter the Last Name:");
			String lName = sc.nextLine();
			System.out.println("Enter the Phone No:");
			long phoneNo = Long.parseLong(sc.nextLine());
			System.out.println("Enter the Email:");
			String email = sc.nextLine();
			contact = new Contact(fName,lName,phoneNo,email);
			phoneBook.addContact(contact);
			break;
		case 2:
			List<Contact> list = new ArrayList<>();
			System.out.println("The contacts in the List are:");
			list = phoneBook.viewAllContacts();
			for (Contact contact2 : list) {
				System.out.println("First Name:"+contact2.getFirstName()+"\nLast Name:"+contact2.getLastName()+"\nPhone No.:"+contact2.getPhoneNumber()+"\nEmail:"+contact2.getEmailId());
			}
			break;
		case 3:
			System.out.println("Enter the Phone number to search contact:");
			long phoneNo1 = Long.parseLong(sc.nextLine());
			contact =  phoneBook.viewContactGivenPhone(phoneNo1);
			System.out.println("First Name:"+contact.getFirstName()+"\nLast Name:"+contact.getLastName()+"\nPhone No.:"+contact.getPhoneNumber()+"\nEmail:"+contact.getEmailId());
			
			break;
		case 4:
			System.out.println("Enter the Phone number to remove :");
			long phoneNo2 = Long.parseLong(sc.nextLine());
			System.out.println("Do you want to remove the contact (Y/N):");
			String chRemove = sc.nextLine();
			if(chRemove.equalsIgnoreCase("Y")) {
				Boolean a = phoneBook.removeContact(phoneNo2);
				if(a) {
					System.out.println("The contact is successfully deleted.");
				}
			}
			
			break;
		case 5:break;
		default:System.out.println("Please enter correct choice");	
		}
		
		}while(ch!=5);	

	}

}
