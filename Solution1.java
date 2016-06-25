import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     {
            int n1 = in.nextInt();
           	
           ArrayList<Integer> a1 =new ArrayList<Integer>();
            for(int j=0; j < n1; j++){
               
                a1.add(in.nextInt());
            }
            int n2 =in.nextInt();
            
            ArrayList<Integer> a2 =new ArrayList<Integer>();
            for (int i=0; i< n2; i++){
            	a2.add(in.nextInt());
            }
            Collections.sort(a1);
            Collections.sort(a2);
            ArrayList<Integer>finalList=new ArrayList<Integer>();
      if(n1<n2){
    	  int j=0;
    	  for(int i=0;i<a2.size();i++){
    		  int e1=a1.get(j);
    		  int e2=a2.get(i);
    		 
    		  if(e2!=e1){
    			  finalList.add(a2.get(i));
    			  
    		  }
    		  else{
    			  j++;
    		  }
    	  }
      }  
      if(n2<n1){
    	  int j=0;
    	  for(int i=0;i<a1.size();i++){
    		  int e1=a1.get(i);
    		  int e2=a2.get(j);
    		 
    		  if(e1!=e2){
    			  finalList.add(a1.get(i));
    			  
    		  }
    		  else{
    			  j++;
    		  }
    	  }
      }  
    Collections.sort(finalList);
    String output=finalList.toString();
    output=output.replaceAll(",","");
    output= output.replaceAll("\\[", "").replaceAll("\\]","");
    System.out.println(output);
     }
    }
}
