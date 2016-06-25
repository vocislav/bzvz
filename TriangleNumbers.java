
public class TriangleNumbers {

	public static Boolean isTriangleNumber(long number) {
	
	for (long i=1;i<number;i++){
		if(i*(i-1)==number*2){
			return true;
		}
		
	}
	
		
		
		return false;
		
  }
	public static void main(String[] args) {
		boolean a = isTriangleNumber(125250);
		System.out.println(a);
		
		// TODO Auto-generated method stub

	}
}
