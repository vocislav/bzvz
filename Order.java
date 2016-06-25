
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Order {
	
	 public static String order(String words) {
		 String temp="";
		List<Integer> niz_brojeva=new LinkedList<>();
		HashMap<Integer,Integer> proba=new HashMap<Integer,Integer>();
		 Pattern p = Pattern.compile("[0-9]+");
		 Matcher m = p.matcher(words);
		 String[] str = words.split("\\s+");
		 
		 while (m.find()) {
		     int n = Integer.parseInt(m.group());
		     niz_brojeva.add(n);  
		 }
		 for(int i=0;i<niz_brojeva.size();i++){
		     int q= niz_brojeva.get(i);
		     proba.put(q,i);
		 }
		 for(int i=1;i<niz_brojeva.size()+1;i++){
			 int c =proba.get(i);
		 temp=temp + str[c]+" ";
		 }
		   return temp.trim();}

	public static void main(String[] args) { 
		String ovo=order("g3ood 4of the2 pe6ople th5e Fo1r");
		System.out.println(ovo);
	
	

	}

}
