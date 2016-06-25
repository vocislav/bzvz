import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sol{

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int t=in.nextInt();
       for(int testC=0; testC<t; testC++){
    	   int n=in.nextInt();
    	   List<Integer> arr =new ArrayList<>();
    	   for(int i=0;i<n;i++){
    		   arr.add(in.nextInt());
    	   }
    	   int max= Collections.max(arr);
    	   int i=0;
    	   int gold=0;
    	   int profit=0;
    	   int num=0;
    	   while(i<n-1){
    	   while(arr.get(i)!=max && i<n-1){
    		   gold=gold-arr.get(i);
    		   i++;
    		   num++;
    	   }
    	   if(i<n){
    	   profit=profit+(arr.get(i)*num +gold);
    	   arr=arr.subList(i, n);
    	    max= Collections.max(arr);
    	    i=0;
    	    n=arr.size();
    	    gold=0;
    	    num=0;
    	    i++;
    	   }}
    	   System.out.println(profit);
       }
       
    }
}