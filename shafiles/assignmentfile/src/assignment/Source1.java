package assignment;
import String;

@FunctionalInterface
interface Validate{
	boolean isValid(String firstName,String lastName);
}


public class Source1 {
	boolean validate(String username,String password) {
		Validate v=(str1,str2)->{return(str1.equals("ABC")&&str2.equals("DEF"))?true:false;};
		return v.isValid(username,password);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source1 s=new Source1();
		System.out.println(s.validate("ABC", "DEF"));

	}}


