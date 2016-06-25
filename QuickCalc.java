import java.math.BigInteger;

public class QuickCalc {
	public static BigInteger choose(int n, int p) {
		
		
		long np = n-p;
		BigInteger n_p=BigInteger.valueOf(1);
		BigInteger p_p=BigInteger.valueOf(1);
		BigInteger result=BigInteger.valueOf(1);
	
		for (long i=np+1;i<n+1;i++){
		 n_p = n_p.multiply(BigInteger.valueOf(i));
		
	}
	for (long i =1;i<p+1;i++){
		p_p = p_p.multiply(BigInteger.valueOf(i));
		
	}
	
	
	result=n_p.divide(p_p);

	
	return result;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 BigInteger proba=choose(52,5);
 System.out.println(proba);
	}

}
