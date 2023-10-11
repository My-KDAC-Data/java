package com.sunbeaminfo;

import java.util.Scanner;

public class Employee {
		
		private String fname;
		private String lname;
		private double sal;
		
		
		Scanner sc=new Scanner(System.in);
		
		public Employee()
		{
			
		}

		public Employee(String fname, String lname, double sal) 
		{
			this.fname = fname;
			this.lname = lname;
			this.sal = sal;
			
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public double getSal() {
			return sal;
		}

		public void setSal(double sal) {
			this.sal = sal;
		}
		
		public void incrpermonth() {
			
			this.sal=this.sal+this.sal*0.10;
		}
		
        public void yearsal() {
        	
        	double Annual_sal=this.sal*12;
        	System.out.println("Yearly Salary="+Annual_sal);
				
		}
		
		
	}


