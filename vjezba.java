import java.util.*;
class  Robot {

	public void speak(String text){
		System.out.println(text);}

		public int nesto(int broj)
		{   int kvadrat;
		
			kvadrat=broj*broj;
			return kvadrat;
	}
		public double la(int broj){
			double korjen;
			korjen=Math.sqrt(broj);
			return korjen;
		}
}
public class vjezba {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Upiši broj koji želiš kvadrirati: ");
		Robot ava=new Robot();
		int broj1=in.nextInt();
		double da=ava.la(broj1);
		
		int oho=ava.nesto(broj1);
		ava.speak("Bok, ja sam robot koji kvadrira i korjenuje");
		System.out.println("Ovo je kvadrat: "+oho+" broja "+broj1+" , a ovo njegov korjen: "+da);
	}

}
