package com.sunbeam;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Tester {
	
	public static int menu()
	{
		int choice;
		Scanner sc=new Scanner (System.in);
		
		System.out.println("0.EXIT");
		System.out.println("1.Delete Candidate");
		System.out.println("2.Add Candidate");
		System.out.println("3.Update Candidate");
		System.out.println("4.Find All Candidate");
		System.out.println("5.Party Wise Votes Of Candidate");
		System.out.print("Enter Your Choice:");
		
		choice=sc.nextInt();
		
		return choice;
	}

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		int choice;
		while((choice = menu()) != 0) {
			
			switch(choice) {
			
			case 1:
				
				
				try(CandidateDAO dao=new CandidateDAO()) {
					System.out.print("Enter the ID to be Delete:");
					int id=sc.nextInt();
					int cnt=dao.deleteById(id);
					System.out.println("Row Deleted " +cnt);
					
				} // dao.close
				
				catch (Exception e) {
					e.printStackTrace();
				}
				
			case 2:
				try(CandidateDAO cd=new CandidateDAO()) 
				{
					Candidate cand=new  Candidate();
					
					System.out.print("Enter the Name:");
					String name=sc.next();
					System.out.print("Enter the Party:");
					String party =sc.next();
					System.out.print("Enter the Votes:");
					int votes=sc.nextInt();
					
					cand.setName(name);
					cand.setParty(party);
					cand.setVotes(votes);
					
					int cnt=cd.addUser(cand);
					System.out.println("Row Inserted "+cnt);
				}
				
				catch (Exception e) {
					e.printStackTrace();
				}
				
			case 3:
				try(CandidateDAO dao=new CandidateDAO()) {
					System.out.print("Enter Id for update Name & Party:");
					int id=sc.nextInt();	
					System.out.print("Enter Name:");
					String name=sc.next();
					System.out.print("Enter Party:");
					String party=sc.next();
					int cnt=dao.modNameParty(name, party, id);
					System.out.println("Rows Updated: "+cnt);
					
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				
			case 4:
				try(CandidateDAO dao=new CandidateDAO()) {
					
					List<Candidate>list=dao.findAll();
					for (Candidate cand : list) {
						System.out.println(cand);
					}
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				
			case 5:
				try(CandidateDAO dao=new CandidateDAO()) {
					List<Partyvotes> pvotes=dao.getPartywiseVotes();
					for (Partyvotes partyvotes : pvotes) {
						System.out.println(partyvotes);
						
					}
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				
				    
				   
			}
		}
	}

}
