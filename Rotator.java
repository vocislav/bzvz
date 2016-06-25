import java.util.Arrays;
import java.util.Collections;

//If n is greater than 0 it should rotate the array to the right. 
//If n is less than 0 it should rotate the array to the left. 
//If n is 0, then it should return the array unchanged.
public class Rotator {
	public static Object[] rotate(Object[] data, int n) {
		
	
		Collections.rotate(Arrays.asList(data), n);
		return data;
			}
			

	public static void main(String[] args) {
		Object[] data = new Object[]{"a","b","c"};
		Object[]proba=   rotate(data, 788);
        System.out.println(Arrays.toString(proba));
	}

}
