
public class MA {
	public static long conjecture (long x) {
		  
		  long a=1;
		while(x>1){
			
			if(x%2==0){
				x=x/2;
			}
			else if(x%2==1){
				x=x*3+1;
			}
			a++;
		}
		 
		return a;
	   
	  }
	public static void main(String[] args) {
		
		long m=conjecture(20);
		System.out.println(m);
	
	}

	}


