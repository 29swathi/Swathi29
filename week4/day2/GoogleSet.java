package week4.day2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class GoogleSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="google";
		char[] charAry=str.toCharArray();
		Set<Character> output=new LinkedHashSet<Character>();
		for (int i = 0; i < charAry.length; i++) {
			output.add(charAry[i]);
		}
		System.out.println(output);
	}

}
