import java.util.*;
import java.text.DecimalFormat;
class Brojevi{
	static void smjerniKut(double y1,double x1,double y2,double x2) //raèunanje smjernog kuta
	{
		double dy=y2-y1;
		double dx=x2-x1;
		double kut = Math.atan(dy/dx);
		double stup = Math.toDegrees(kut);
		
		
		if(dy<0&&dx>0){
			stup=stup+360;
		}
		else if (dy<0&&dx<0){
			stup=stup+180;
		}
		else if(dy>0&&dx<0) {
			stup=stup+180;
		}
		else {stup=stup+0;}
	  
	    String bkut= ""+stup; //prebacivanje u kutni oblik
	    String[] rkut=bkut.split("\\.");
	    int vkuta= Integer.parseInt(rkut[0]);
	    double min=(stup-vkuta)*60;
	    String bmin=""+min;
	    String [] rmin=bmin.split("\\.");
	    int vmin=Integer.parseInt(rmin[0]);
	    double sec=(min-vmin)*60;
	    
	    DecimalFormat df = new DecimalFormat();//odreðivanje željenog broja decimala za sekunde
	    df.setMinimumFractionDigits(4);
	    df.setMinimumFractionDigits(4);
	    
	    String radkut = ""+kut;//poravnavanje teksta stupnjeva i radijana
	    int dimrad=radkut.length();
	    String degkut = ""+vkuta+" "+vmin+" "+df.format(sec)+" ";
	    int dimdeg = degkut.length();
	    int razlikaDuljina = dimrad - dimdeg;
	    int i;
	    String a=" ";
	    for(i=0;i<razlikaDuljina-1;i++)
	    {
	    	
	    	a=" "+a;
	    }
	    
	    
		
		System.out.println("\n"+"Smjerni kut sa toèke 1 na toèku 2 je:"+"\n"+"-------------------------------------------"+"\n");
		System.out.println(kut+"   |RADIJANA"+"\n"+"-------------------------------------------");
		System.out.println(vkuta+ "°"+vmin+"'"+df.format(sec)+"\""+a+"   |STUPNJEVA");
		
	}
	
	
}
public class Koordinate {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Unesite koordinate u slijedeæem formatu:   T (y , x)"+"\n"+"____________________________________________________");
		
		System.out.println("\n"+"T1 (y1 ,x1)"+"\n"+"-------------");
		double y1=in.nextDouble();
		double x1=in.nextDouble();
		
		System.out.println("T2 (y2, x2)"+"\n"+"-------------");
		double y2=in.nextDouble();
		double x2=in.nextDouble();
		Brojevi.smjerniKut(y1,x1,y2,x2);
		in.close();
		

	}

}
