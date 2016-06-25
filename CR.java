//"coffee", "eecoff" => 2

//"eecoff", "coffee" => 4
public class CR {
	
	static int shiftedDiff(String first, String second){
		int num=0;
		int length=first.length();
		
		while(num<length && !first.equals(second))
		{
			
		String a=first.substring(length-1);
		String b=first.substring(0, length-1);
		
		first=a+b;
		
		num++;
		
		
		}
		if(num==length){
			return -1;
		}
	
	
	return num;
	}
	 public static void main(String[] args) {
		int p=shiftedDiff("moose", "Moose");
	      
		 System.out.println(p);
	    }	
}

