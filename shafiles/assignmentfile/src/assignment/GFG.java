package assignment;

import java.util.Arrays;
import java.io.*;
//import java.util.*;

    class GFG {
	public static boolean checkAnagram(String s1, String s2)
	{
		int s2hash[] = new int[26];
		int s1hash[] = new int[26];
		int s1len = s1.length();
		int s2len = s2.length();
		if (s1len > s2len) {
			return false;}
			int left = 0,right=0;
			while (right < s1len) {
				s1hash[s1.charAt(right) - 'a'] += 1;
				s2hash[s2.charAt(right) - 'a'] += 1;
				right++;
			}
			right -= 1;
			while (right < s2len) {
				if (Arrays.equals(s1hash, s2hash))
					return true;
				right++;
				if (right != s2len)
					s2hash[s2.charAt(right) - 'a'] += 1;

				s2hash[s2.charAt(left) - 'a'] -= 1;
				left++;
			}
			return false;
		
		//return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ab";
		String s2 = "vcw";
		if (checkAnagram(s1, s2))
			System.out.println("YES");
		else
			System.out.println("NO");

	}
	

}
