package dec14;

import java.util.ArrayList;

public class Problem476 {
	public static int findComplement(int num) throws Exception {
		ArrayList<Integer> binary=new ArrayList<>();
		while(num!=0) {
			//binary.a
			binary.add(num%2);
			num=num/2;
		}
		
		for(int i=0;i<binary.size();i++) {
			if(binary.get(i)==0) {
				binary.set(i, 1);
			}else if(binary.get(i)==1) {
				binary.set(i, 0);
			}else {
				throw new Exception("incorrect state,programming error");
			}
		}
		for(int k:binary) {
			System.out.print(k);
			System.out.println();
		}
		int result = 0;
		int listSize=binary.size();
		for(int i=listSize-1;i>0;i--) {
			//System.out.println((2^((listSize-1)-i)));
			result=(int) (result + (binary.get(i))*(java.lang.Math.pow(2,(i))));
			
		}
		if( binary.get(0)==1) {
			result=(int) (result+ 1);
		}
		
		return result;

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(findComplement(10));
	}

}
