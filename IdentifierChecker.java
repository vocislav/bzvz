
public class IdentifierChecker {
	public static boolean isValid(String idn) {
		char[] arr= idn.toCharArray();
		
		if(arr.length==0){
			return false;
		}
		
		else if(Character.isDigit(arr[0])){
			return false;
		}
		else if(Character.isLetter(arr[0])||arr[0]=='_' ||arr[0]=='$'||arr[0]!=' '){
			for(int i=0; i<arr.length;i++){
				if(arr[i]==' '||!((Character.isLetter(arr[i])||arr[i]=='_' ||arr[i]=='$'||Character.isDigit(arr[i])))){
					return false;
				}
			
			}
			
			return true;
		} 
		
		return false;
	}
	public static void main(String[] args) {
		
		boolean a=isValid("");
		System.out.println(a);
		

	}

}
