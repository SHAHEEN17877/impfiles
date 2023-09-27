package assignment;

public class MiddleNumberPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int numRows1=2;
     int numRows2=3;
     int numRows3=4;
     
    // System.out.println("MiddleNmuberPyramid1:");
     printMiddleNumberPyramid(numRows1);
     
    // System.out.println("\nMiddleNumberPyramid2:");
     printMiddleNumberPyramid(numRows2);
     
    // System.out.println("\nMiddleNumberPyramid3:");
     printMiddleNumberPyramid(numRows3);
	}
	public static void printMiddleNumberPyramid( int numRows) {
	for(int i=1;i<=numRows;i++) {
		for(int j=1;j<=numRows-i;j++) {
			System.out.print(" ");
		}
		for(int k = 1;k<=i;k++) {
			System.out.print(i+" ");
		}
		System.out.println("");
	}
     }
	}


