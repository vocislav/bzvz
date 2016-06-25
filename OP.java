import java.text.DecimalFormat;

public class OP {
	static DecimalFormat df = new DecimalFormat("0.00");
	
	 //int [][] numbers= new int[2][2];
	//int x_1=numbers[0][0];
	//int x_2=numbers[1][0];
	//int y_1=numbers[1][0];
	//int y_2=numbers[1][1];
	static String length(int [][] numbers){
		int x_1=numbers[0][0];
		int x_2=numbers[1][0];
		int y_1=numbers[0][1];
		int y_2=numbers[1][1];
		double b=Math.pow((x_1-x_2), 2);
		double c=Math.pow((y_1-y_2), 2);
		double a =Math.sqrt(b+c);
		String d = df.format(a);
		return d;
	}

	//Find the length between 2 co-ordinates. The co-ordinates are made of integers between 
	//-20 and 20 and will be given in the form of a 2D array:

		//(0,0) and (5,-7) would be [ [ 0 , 0 ] , [ 5, -7 ] ]

		//The function must return the answer rounded to 2 decimal places in the form of a string.

		// lengthOfLine([ [ 0 , 0 ] , [ 5, -7 ] ]); => "8.60"
	public static void main(String[] args) {
		
		int[][]proba=new int[][]{
			{0,0},{5,7}};
			String m=length(proba);
			System.out.println(m);
		// TODO Auto-generated method stub

	}

}
//function lengthOfLine(array){
//return ; //length of the line rounded to 2 decimal places as a string
//}