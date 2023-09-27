package assignment;

 class MyException extends Exception {
	public MyException(String string) {
		// TODO Auto-generated constructor stub
	}

	public void MyException(String s) {
		//super(s);
	}
}
public class Source{
public	String  CheckAge(int age)throws MyException{
		if(age<18) {
			throw new MyException("Age is smaller than 18");
		}
		else
		{
	       return "valid Age";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source v=new Source();
		try {
			v.CheckAge(20);
			}
		catch(MyException e) {
			System.out.println("Exception occurs");
			System.out.print(e.getMessage());
		}

	}

}
