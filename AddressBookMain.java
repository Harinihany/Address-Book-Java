package com.AddressBook.java;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

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
            System.out.println("1.Edit 2.Delete 3.Display 4.AddPerson 5.Duplicate 6.SortByFName 7.SortBy_city_state_zip 8.Store_city_state_firstname 9.SearchByCity 10.SearchByState ");
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
               
                case 2 : //delete contact
                	System.out.print("Enter contact index : ");
                    int index = sc.nextInt();
                    personList.remove(index);
                	System.out.println("contact deleted successfully");
                break;
                	
                 case 3: //display contact
                	for ( int i=0; i<personList.size(); i++) {
                		System.out.println(i);
                		System.out.println(personList.get(i));
                	}
                break;
                 case 4: //Add Multiple person
                     System.out.print("enter name firstname: ");
                     String searchFirstName = sc.next();
                     Predicate<Person> pStream = s -> s.firstName.contains(searchFirstName);
                     boolean b1 = personList.stream().anyMatch(pStream); 
         
                     if(b1 == true)
                     {
                         System.out.println("first name found");
                     }
                     else
                     {
                         System.out.print("Enter last name:");
                         String lastName1 = sc.next();
                         System.out.print("Enter address:");
                         String address1 = sc.next();
                         System.out.print("Enter city:");
                         String city1 = sc.next();
                         System.out.print("Enter state:");
                         String state1 = sc.next();
                         System.out.print("Enter zip:");
                         String zip1 = sc.next();
                         System.out.print("Enter phoennumber:");
                         String phoneNumber1 = sc.next();
                    
                         Person personObjects1 = new Person(searchFirstName, lastName1, address1, city1, state1, zip1, phoneNumber1);
                         personList.add(personObjects1);

                         System.out.println("Inserted");
                     }
               break;
                 case 5: //checking for duplicates and Adding Multiple persons
                     System.out.print("enter name firstname: ");
                     String searchFirstName1 = sc.next();
                     Predicate<Person> pStream1 = s -> s.firstName.contains(searchFirstName1);
                     boolean b11 = personList.stream().anyMatch(pStream1); 
         
                     if(b11 == true)
                     {
                         System.out.println("first name found");
                     }
                     else
                     {
                         System.out.print("Enter last name:");
                         String lastName1 = sc.next();
                         System.out.print("Enter address:");
                         String address1 = sc.next();
                         System.out.print("Enter city:");
                         String city1 = sc.next();
                         System.out.print("Enter state:");
                         String state1 = sc.next();
                         System.out.print("Enter zip:");
                         String zip1 = sc.next();
                         System.out.print("Enter phonenumber:");
                         String phoneNumber1 = sc.next();
                    
                         Person personObjects1 = new Person(searchFirstName1, lastName1, address1, city1, state1, zip1, phoneNumber1);
                         personList.add(personObjects1);

                         System.out.println("Inserted");
                     }
             break;
               
                 default: System.out.println("Invalid Option");
               break;
               
               
                					
                
            }
        }
    }  
}
