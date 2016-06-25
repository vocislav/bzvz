import java.text.DecimalFormat;

public class Barycenter {
	static DecimalFormat df = new DecimalFormat("0.0000");
	public static double[] barTriang(double[] x, double[] y, double[] z)
    {
		double x1=x[0];
		double x2=y[0];
		double x3=z[0];
		
		double y1=x[1];
		double y2=y[1];
		double y3=z[1];
		
		double x0= Double.parseDouble(df.format((x1+x2+x3)/3));
		double y0= Double.parseDouble(df.format((y1+y2+y3)/3));
		
		double bar []=new double[2];
		bar[0]=x0;
		bar[1]=y0;
		return bar;
        // your code
    }

	

}
