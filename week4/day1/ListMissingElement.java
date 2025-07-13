package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 10, 6, 8));
		Collections.sort(li);
		int x=1;
		for (Integer i : li) {
			for(int j=x;j<=i;j++)
			{
				if(j!=i)
				System.out.println(j);
				x++;
			}
			
		}
	}

}
