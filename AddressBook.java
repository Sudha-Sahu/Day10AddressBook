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
	public void displayPersonAddress() {
		for(int i=0;i<person.size();i++) 
			System.out.println(person.get(i)+" ");
	}
	public void deleteContact() {
		System.out.println("Enter person firstname you want to delete from address book : ");
		String deleteName = sc.next();
		int index=0;
		boolean isFoundPerson=false;
		for(int i=0;i<person.size();i++) {
			if(person.get(i).getFirstName().equals(deleteName)) {
				index= i;
				isFoundPerson = true;
				break;
			}
		}
		if(isFoundPerson) {
			person.remove(index);
			System.out.println("given person name is deleted.....");
		}
		else
			System.out.println("Not found in the list to be deleted.....");
	}
	public static void main(String[] args) {

		AddressBook address = new AddressBook();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many contacts you want to add in address book : ");
		int numOfContact = sc.nextInt();
		for(int i=0;i<numOfContact;i++) 
			address.getDetails();
		System.out.println("displaying the list from address book before deleting.....");
		address.displayPersonAddress();
		address.deleteContact();
		System.out.println("displaying the list from address book after deleting.....");
		address.displayPersonAddress();
	}
}