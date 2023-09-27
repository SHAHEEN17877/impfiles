package assignment;

public class CalculateDistance {
	public static void calDistance(double u,int a,int t) {
		System.out.println("Distance covered:"+(u*t+(0.5*a*t*t)));
		}
	public static void main(String[]args) {
		int ul=36;double u=(36*1000)/3600;
		int a=5,t1=10,t2=8;
		calDistance(u,a,t1);
		calDistance(u,a,t2);
	}

}
