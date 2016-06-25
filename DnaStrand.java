import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import java.util.Scanner;

public class DnaStrand {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int test=0;test<t;test++){
        	int n=in.nextInt();
        	ArrayList<ArrayList<Character>>arr_arr=new ArrayList<>();
        	for(int i=0;i<n;i++){
        		String s=in.next();
        		char[]charr=s.toCharArray();
        		ArrayList<Character> arr=new ArrayList<>();
        		for(int z=0;z<n;z++){
        			arr.add(charr[z]);
        		}
        		Collections.sort(arr);
        		arr_arr.add(arr);
        		
        	}
        	boolean flag=true;
        	for(int i=0;i<n;i++){
        		ArrayList<Character> arr=new ArrayList<>();
        		for(int j=0;j<n;j++){
        		
        		arr.add(arr_arr.get(j).get(i));
        		}
        		
        		ArrayList<Character> compare=arr;
        		Collections.sort(arr);
        		if(!compare.equals(arr)){
        			flag=false;
        		}
        	}
        	if(flag==true){
        		System.out.println("YES");
        	}
        	else{
        		System.out.println("NO");
        	}
        }
    }
}
