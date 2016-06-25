public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {
    	char[] part_1 = part1.toCharArray();
    	char[] part_2 = part2.toCharArray();
    	char a=s.charAt(0);
    	String temp;
    	String temp2;
    	temp="";
    		//s.startsWith(temp)
    	for(int i=0;i<=part_1.length;i++){
    	//bezveze kod, samo da mi ne javi error
    		if(a=='a'){
    			//temp=temp.substring(0,i);
    			temp=temp+part_1[i];
    			System.out.println(temp);
    			
    		}
    		else {
    			temp=""+part_2[i];
    			System.out.print(temp);
    		}
    		
    	
    	}
    	
       return false;
    }
    public static void main(String[] args) {
       boolean test=isMerge("codewars","cdw","oears");

    }
}