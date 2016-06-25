
public class User {
	private int urank=-8;
	private double uprogress=0;
	private int uincrement;
	
	
	private int rank(){
		return urank;
	}
	
	private double progress(){
		return uprogress;
	}
	
	private double incProgress(int rank){
	
		if(rank==urank){
			uprogress=uprogress+3;
		}
		if (rank==urank-1){
			uprogress=uprogress+1;
		}
		if(rank>urank){
			
			uprogress= uprogress+(Math.pow(Math.abs(rank-urank),2)*10);
		}
		
	    
		if(uprogress>99){
			while(uprogress>99){ 
			uprogress=uprogress-100;
		    urank=urank+1;
				
			
			if(urank==0){
				urank=urank+1;
			}
		
		 }}
	
	return uprogress;}
	
	public static void main(String[] args) {
	
	 User ana=new User();
	 double c=ana.incProgress(1);
     System.out.println(c);
     System.out.println(ana.rank());
     System.out.println(ana.progress());
	}

}
