package main1;

import java.util.Arrays;

public class Day18FindAnagram {
	public static void main(String[] args) {
		
		String s1="Race";
		String s2="Care";
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.length()==s2.length()) {
			
			
			char[] ca1=s1.toCharArray();
			char[] ca2=s2.toCharArray();
			Arrays.sort(ca1);
			Arrays.sort(ca2);
			
			boolean s=Arrays.equals(ca1, ca2);
			if(s) {
				System.out.println(s1 +" and "+s2+" are not anagram");
			}else {
				System.out.println(s1 +" and "+s2+" are not anagram");
			}
			
		}else {
			System.out.println(s1 +" and "+s2+" are not anagram");
		}
	}

}
