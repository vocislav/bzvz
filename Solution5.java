import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution5 {
	static String theBeast(int n){
		
		String result="";
		
		
		if(n%3==0){
    		
    		String mod3 = new String(new char[n]).replace('\0', '5');
    		return mod3;}
    	
    	int ln=n;
    	
		for(int i=1;i<ln+1;i++){
			
			
			if(i%5==0 && (n-i)%3==0){
				String mod3 = new String(new char[n-i]).replace('\0', '5');
				/*for(int j=0;j<(n-i);j++){
					result=result+5;
				}*/
				String mod5 = new String(new char[i]).replace('\0', '3');
				/*for(int j=0;j<i;j++){
					result=result+3;
				}*/
				return mod3+mod5;
			}
			
		}
		
		if(result.equals("")){
			return"-1";
		}
		return result;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(theBeast(n));
         
        }
    }
}

