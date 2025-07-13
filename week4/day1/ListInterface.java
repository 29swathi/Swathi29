package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li=new ArrayList<Integer>(Arrays.asList(3, 2, 11, 4, 6, 7));
		Collections.sort(li);
		System.out.println(li.get(li.size()-2));
	}

}
