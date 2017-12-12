package dec12;

public class Problem657 {
	public static boolean judgeCircle(String moves) {
        char[] chMoves=moves.toCharArray();
        int x=0;
        int y=0;
        
        for(int i=0;i<chMoves.length;i++){
            if(chMoves[i]=='U') {
            	y+=1;
            }
            if(chMoves[i]=='D') {
            	y-=1;
            }
            if(chMoves[i]=='L') {
            	x-=1;
            }
            if(chMoves[i]=='R') {
            	x+=1;
            }
        }
        if(x==0 && y==0) {
        	return true;
        }else {
        	return false;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(judgeCircle("UD"));
		
	}

}
