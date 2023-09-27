package assignment;

import java.util.Scanner;

class MyException extends Exception {
	public MyException(String message) {
		super(message);
	}
}
 class CheckNameExceptionEx{
	public String CheckName(String firstName,String lastName) throws MyException{
		if(firstName.isEmpty()) {
			throw new MyException("first name is empty");
		}
		else if(lastName.isEmpty()) {
			throw new MyException("last name is empty");
		}
		else
		{
			return "welcome" +firstName + lastName;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckNameExceptionEx x=new CheckNameExceptionEx();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first name");
		String fname=scan.nextLine();
		System.out.println("enter last name");
		String lname=scan.nextLine();
		
		String s;
		try {
			s=x.CheckName(fname,lname);
			System.out.println(s);
		}
		catch(MyException e) {
			System.out.println(e);
		}
		

	}

}
