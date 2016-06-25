import java.util.ArrayList;

public class Persist {
	public static int persistence(long n) {
		int num=1;
		
		int t=1;
		String N=""+n;
		do {
			String P=N;
			char[]arr2=P.toCharArray();
			t++;
			num=1;
			ArrayList<Integer> dig2=new ArrayList<Integer>();
		for(int i=0;i<dig2.size();i++){
			
			int m=Character.getNumericValue(arr2[i]);
			dig2.add(m);
			num=num*dig2.get(i);
			N=""+num;
			if(num>10){
				dig2.clear();
			
			
			
		}
			
		}
	} while (N.length()>1);
		// your code
	return t;
	}

	public static void main(String[] args) {
		int a = persistence(999);
		System.out.println(a);
		
		// TODO Auto-generated method stub

	}

}
