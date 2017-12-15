package dec15;

import java.util.HashSet;
import java.util.Set;

public class Problem575 {
	public int distributeCandies(int[] candies) {
		Set<Integer> uniqueCandies=new HashSet<>();
		
		for(int i:candies) {
			uniqueCandies.add(i);
		}
		int noOfUniqueCandies=uniqueCandies.size();
		int totalCandiesBy2=candies.length/2;
		if(noOfUniqueCandies>=totalCandiesBy2) {
			return totalCandiesBy2;
		}else {
			return noOfUniqueCandies;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem575 pb=new Problem575();
		int[] data={1,1,1,1,1};
		int k=pb.distributeCandies(data);
		System.out.println(k);
	}

}
