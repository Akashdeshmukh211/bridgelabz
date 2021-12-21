package oopsConsept;

import java.util.*;

public class AddressBook {

	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		addressBook.askUser();

	}
	public class Person {

		String firstName;
		String lastName;
		String address;
		String city;
		String state;
		String zip;
		String phoneNumber;
		
		public Person(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.city = city;
			this.state = state;
			this.zip = zip;
			this.phoneNumber = phoneNumber;
		}

	}

	/** Menu **/
	void askUser() {
		System.out.println("Select an action..");
		System.out.println("1. Add a person");
		System.out.println("2. Edit");
		System.out.println("3. Delete a person");
		System.out.println("4. Search a person");
		System.out.println("5. Quit");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			addAPerson();
			System.out.println("\n");
			askUser();
			break;
		case 2:
			System.out.print("Enter first and last name of the person to edit the contact: ");
			System.out.println("\n");
			askUser();
			break;
		case 3:
			System.out.print("Enter first and last name of the person to delete the contact: ");
			System.out.println("\n");
			askUser();
			break;
		case 4:
			System.out.print("Enter first and last name of the person to search: ");
			System.out.println("\n");
			askUser();
			break;
		default:
			break;
		}
	}
	/** gets user's info **/
	void addAPerson() {
		System.out.print("Enter first and last name: ");
		String firstName = sc.next();
		String lastName = sc.next();
		
		System.out.print("Enter complete address: ");
		sc.nextLine();
		String address = sc.nextLine();
		
		System.out.print("Enter city, state and zip: ");
		String city = sc.next();
		String state = sc.next();
		String zip = sc.next();
		
		System.out.println("Enter phone number: ");
		String phoneNumber = sc.next();
		
		
		Person person = new Person(firstName, lastName, address, city, state, zip, phoneNumber);
		String[] PersonDetails = {firstName,lastName,address,city,state,zip,phoneNumber };
		for(int i =0; i <= PersonDetails.length -1;i++) {
			System.out.println(PersonDetails[i]+" ");
		}

	}
	
	
	
}
