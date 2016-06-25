import java.io.*;
import java.util.*;
public class Collatz {
	
	
	
  public static long conjecture(long x) {
	  
	  int a=0;
	while(x>1){
		
		if(x%2==0){
			x=x/2;
		}
		else if(x%2==1){
			x=x*3+1;
		}
		a++;
	}
	 System.out.println(a);
	return 0;
   
  }
 long m= conjecture(20);
}
