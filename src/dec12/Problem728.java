package dec12;

import java.util.ArrayList;
import java.util.List;

public class Problem728 {
	// A self-dividing number is a number that is divisible by every digit it
	// contains.
	//
	// For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 ==
	// 0, and 128 % 8 == 0.
	//
	// Also, a self-dividing number is not allowed to contain the digit zero.
	//
	// Given a lower and upper number bound, output a list of every possible self
	// dividing number, including the bounds if possible.
	public static List<Integer> noToDigits(int num){
		List<Integer> digits=new ArrayList<>();
		int n=10;
		while (num!=0) {
			digits.add(num%n);
			num=num/n;
			//n=n*10;
		}
		return digits;
	}
	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> result=new ArrayList<>();
		for(int i=left;i<=right;i++) {
			boolean temp=true;
			List<Integer> digits=noToDigits(i);
			for(int d:digits){
				if(d==0) {
					temp=false;
					continue;}
				if(i%d !=0) {
					temp=false;
				}
			}
			if(temp==true) {
				result.add(i);
			}
		}
		
		
		return result;

	}

	public static void main(String[] args) {
		
		List<Integer> list=selfDividingNumbers(66,708);
		for(int i:list) {
			System.out.println(i);
		}
	}
}
