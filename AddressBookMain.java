package com.AddressBook.java;

import java.util.ArrayList;
import java.util.Scanner;

class Person 
{   
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    String phoneNumber;
 
    public Person(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

	public void setLastName(String value) {
		// TODO Auto-generated method stub
		
	}

	public void setAddress(String value) {
		// TODO Auto-generated method stub
		
	}

	public void setCity(String value) {
		// TODO Auto-generated method stub
		
	}

	public void setState(String value) {
		// TODO Auto-generated method stub
		
	}

	public void setZip(int value) {
		// TODO Auto-generated method stub
		
	}

	public void setPhoneNumber(int value) {
		// TODO Auto-generated method stub
		
	}    
}


public class AddressBookMain {
	public static void main(String[] args) 
    {
        System.out.println(" WELCOME TO ADDRESS BOOK PROGRAM");
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> personList = new ArrayList<Person>();
        
        System.out.print("Enter first name:");
        String firstName = sc.next();             
        System.out.print("Enter last name:");
        String lastName = sc.next();
        System.out.print("Enter address:");
        String address = sc.next();
        System.out.print("Enter city:");
        String city = sc.next();
        System.out.print("Enter state:");
        String state = sc.next();
        System.out.print("Enter zip:");
        String zip = sc.next();
        System.out.print("Enter phonenumber:");
        String phoneNumber = sc.next();
                       
        Person personObject = new Person(firstName, lastName, address, city, state, zip, phoneNumber);
        personList.add(personObject);
        System.out.println("New person details had been added");
        int temp = 1;
        while(temp > 0)
        {
            System.out.println("[1.Edit]");
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1: //Edit Existing Person Details
                        System.out.print("enter the name to edit: ");
                        //String tempFirstName = sc.next();
                        System.out.print("Enter Contact Index: ");
                        int ind = sc.nextInt();
                        System.out.println("1.LastName  2.address  3.city  4.state  5.zip 6.phoneNumber");
                        System.out.print("Select the field to edit:");
                        int opt = sc.nextInt();
                        
                        
                        if(opt == 1 )
                        {
                            System.out.print("Enter the value: ");
                            String value = sc.next();
                            //last name modification
                            personList.get(ind).setLastName(value);
                        }
                        else if(opt == 2)
                        {
                            System.out.print("Enter the value: ");
                            String value = sc.next();
                            //address modification
                            personList.get(ind).setAddress(value);
                        }
                        else if(opt == 3)
                        {
                            System.out.print("Enter the value: ");
                            String value = sc.next();
                            //city name modification
                            personList.get(ind).setCity(value);
                        }
                        else if(opt == 4)
                        {
                            System.out.print("Enter the value: ");
                            String value = sc.next();
                            //state name modification
                            personList.get(ind).setState(value);
                        }
                        else if(opt == 5)
                        {
                            System.out.print("Enter the value: ");
                            int value = sc.nextInt();
                            //zip modification
                            personList.get(ind).setZip(value);
                        }
                        else if(opt == 6)
                        {
                            System.out.print("Enter the value: ");
                            int value = sc.nextInt();
                            //phone number modification
                            personList.get(ind).setPhoneNumber(value);
                        }
                        else
                        {
                            System.out.println("Error");
                        }
                        System.out.println("UPDATED");         
                break;
                
                default: System.out.println("Invalid Option");
                break;
                
            }
        }
    }  
}
