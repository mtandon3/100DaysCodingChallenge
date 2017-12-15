package dec15;

import java.util.StringTokenizer;

public class Problem557 {
	public String reverseWords(String s) {
		String[] words=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<words.length;i++) {
			sb.append(reverseLetters(words[i]));
			//if(i!=words.length-1)
			sb.append(" ");
		}
		return sb.toString();

	}

	private String reverseLetters(String k) {
		char[] charStr=k.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=(charStr.length)-1;i>=0;i-- ) {
			sb.append(charStr[i]);
		}
		return sb.toString();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem557 pb=new Problem557();
		String k=pb.reverseWords("Let's take LeetCode contest");
		System.out.println(k);
	}

}
