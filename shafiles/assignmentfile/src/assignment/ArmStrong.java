package assignment;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=716,originalNumber,reminder,result=0;
		originalNumber=number;
		while(originalNumber!=0) {
			reminder=originalNumber%10;
			result +=Math.pow(reminder, 4);
			originalNumber /=10;
		}
      if(result==number) {
    	  System.out.println(number+" is an armstrong number");
      }
      
    	  else
    		  System.out.println(number+" is not an armstrong number");
      }
	}

