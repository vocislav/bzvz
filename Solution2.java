
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {
    public static int Diag (int n,int matrix[][]){
      
        int sum=0;
       
        int a =0;
        int b=0;
       
       
        int row []=new int[n];
        
        for(int i=0; i<n; i++){
        	for(int j=0; j<n; j++){
        	
        	 row[j]=matrix[i][j];
        	 
        }
        	a=row[i]+a;
        	b=row[(n-1)-i]+b;
        }
    sum=Math.abs(a-b);
    return sum;
    }
    

        
        
    

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=in.nextInt();
        System.out.println("Matrica:");
        int[][]matrix=new int[n][n];
        for (int i=0;i<n;i++){
        String input=br.readLine();
        String[]string_arr=input.split("\\s+");
      
        for(int j=0; j<n; j++){
        int p= Integer.parseInt(string_arr[j]);
        matrix[i][j]=p;
        
   
        }
        }
        
        
      
       
    
    int c=Diag(n,matrix);
    System.out.println(c);
}
}
