package com.Bridgelabz.Day10Assignment;
import java.util.*;

public class AddressBook{

	ArrayList<ContactPerson> person = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	int countIndex;

	AddressBook() {

		System.out.println("Welcome to Address Book program in AddressBook Main class!!!!");
	}
	public void getDetails() {

		System.out.println("Add person details.....");
		ContactPerson person = new ContactPerson();
		
		System.out.println("Enter the First name of user Contact : ");
		person.setFirstName(sc.next());
		System.out.println("Enter the Last name of user Contact : ");
		person.setLastName(sc.next());
		System.out.println("Enter the address of user Contact : ");
		person.setAddress(sc.next());
		System.out.println("Enter the City of user Contact : ");
		person.setCity(sc.next());
		System.out.println("Enter the State of user Contact : ");
		person.setState(sc.next());
		System.out.println("Enter the ZipCode of user Contact : ");
		person.setZip(sc.next());
		System.out.println("Enter the Phone Number of user Contact : ");
		person.setPhoneNumber(sc.next());
		System.out.println("Enter the Gmail of user Contact : ");
		person.setGmail(sc.next());
		System.out.println("Person added.....");
		countIndex++;
	}
	public void displayPersonAddress(int numOfContact) {
		for(int i=0;i<numOfContact;i++) 
			System.out.println(person+" ");
	}
	public static void main(String[] args) {

		AddressBook address = new AddressBook();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many contacts you want to add in address book : ");
		int numOfContact = sc.nextInt();
		for(int i=0;i<numOfContact;i++) 
			address.getDetails();
		address.displayPersonAddress(numOfContact);
	}
}