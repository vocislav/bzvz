
import java.util.*;

import java.math.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int n = in.nextInt();
            String number="";
            int ln=n;
            for (int j=0; j<n; j++){
            	if(j%5==0 || j%3==0){
            		if(ln%5==0 ||n%3==0){
            			if(ln%3==0&&ln%5==0){
            				for (int k=0;k<ln;k++){
            					number=number+5;
            				}
            			break;}
         
            		if(ln%3==0){
            			for (int k=0;k<ln;k++){
            				number=number+5;
            			}
            			
            		}
            		if(j%3==0 ){
            			for (int k=0; k<j; k++){
            				number=number+5;
            			}
            		}
            		if(ln%5==0 ){
            			for (int k=0;k<ln;k++){
            				number=number+3;
            					
            				}
            			if (j%3==0){
        					break;
            			}
            			
            		}
            		if(j%5==0){
            			for (int k=0;k<j;k++){
            				number=number+3;
            			}
            			if(ln%3==0){
        					break;
        				}
            		}
            		
                	break;}
            	}
            	
             	ln--;
            }
       
       
        if(number.length()==0){
        	System.out.println(-1);
       
        }
            else {
            	
                 System.out.println(number);
            }
    }
        in.close();
}
   
}
//2194
//12002
//21965
//55140
//57634