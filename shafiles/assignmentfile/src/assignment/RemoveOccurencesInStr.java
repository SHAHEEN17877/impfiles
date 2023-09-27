package assignment;

//public class RemoveOccurance {
	//package assignment;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class RemoveOccurencesInStr {
		public static String RemoveOccurances(String str, char ch) {
			String str2="";
			int index1=str.indexOf(ch);
			int index2=str.lastIndexOf(ch);
			System.out.println(index1);
			System.out.println(index2);
			for(int i=0;i<str.length();i++) {
				if(i==index1||i==index2) {
					continue;
				}else {
					str2+=str.charAt(i);
				}
			}
			return str2;
			
		}
		public static void main(String[] args) throws IOException {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String str=br.readLine();
			char ch=br.readLine().charAt(0);
			System.out.println(RemoveOccurances(str, ch));;
			
			

		}

	}


