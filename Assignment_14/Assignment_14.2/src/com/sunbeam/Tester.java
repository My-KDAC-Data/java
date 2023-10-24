package com.sunbeam;


import java.util.List;
import java.util.Scanner;

public class Tester {
	
	public static int menu()
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("0.Exit");
		System.out.println("1.Add User");
		System.out.println("2.Display Users");
		System.out.println("3.Upadte Fname & Password");
		System.out.println("4.Delete User");
		System.out.print("Enter Your Choice:");
		choice=sc.nextInt();
		
		return choice;
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		int choice;
		
		
		while((choice = menu()) != 0) {
			
			switch(choice) {
			
			case 1:
				
				try(UsersDAO dao=new UsersDAO()) {	
					Users us=new Users();
					System.out.print("Enter First Name:");
					us.setFname(sc.next());
					System.out.print("Enter Last Name:");
					us.setLname(sc.next());
					System.out.print("Enter EmailID:");
					us.setEmail(sc.next());	
					System.out.print("Enter Password:");		  	
				  	us.setPasswd(sc.next());  	
				  	System.out.print("Enter Date Of Birth(dd-MM-yyyy):");
					us.setBdate(sc.next());	  
					
					int cnt=dao.addUser(us);
					System.out.println("Rows Inserted: "+cnt);	
				}    
				catch (Exception e) {
					e.printStackTrace();
				}
				break;
				
			case 2:
				
				try(UsersDAO dao=new UsersDAO()) {
					List<Users> list=dao.findAll();
					for (Users u : list) {
						System.out.println(u);
						
					}
					
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				break;
				
			case 3:
				
				try(UsersDAO dao=new UsersDAO()) {
					
					Users us=new Users();
					
					System.out.print("Enter User Id to be updated:");
					us.setId(sc.nextInt());
					
					System.out.print("Enter First Name:");
					us.setFname(sc.next());
					
					System.out.println("Enter Passord:");
					us.setPasswd(sc.next());
					
					int cnt=dao.modFnameAndPasswd(us);
					System.out.println("Rows Updated: "+cnt);
					
					
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				break;
				
				
			case 4:
				
				try(UsersDAO dao=new UsersDAO()) {
					
					System.out.print("Enter the ID to be Deleted:");
					int id=sc.nextInt();
					
					int cnt=dao.deleteById(id);
					System.out.println("Rows Deleted: "+cnt);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				
				break;

			}				
			
			}
		}
}
