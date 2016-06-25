import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution0 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        if(y2==y1){
        	if(m2==m1){
        		if(d1<=d2){
        			System.out.println(0);
        			
        		}
        		else{
        			System.out.println(Math.abs(d1-d2)*15);
        		}
        		
        	}
        	else if(m2>m1){
        		System.out.println(0);
        	}
        	else{
        		System.out.println((Math.abs(m2-m1)*500));
        	}
        	
        	
        }
        else if(y2>y1){
        	System.out.println(0);
        }
        
        else {System.out.println(10000);}
    }
}
	

  