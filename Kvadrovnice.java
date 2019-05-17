import java.lang.Double;

public class Kvadrovnice{
	public static void main (String[] args){
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		double d = (b * b) - (4 * a * c);
		if(d < 0) {
			System.out.println("nic");
		} else if(d >= 0) {
			double x1 = (-b + Math.sqrt(d)) / (2 * a);
			System.out.printf("x1=%f\n",x1);
			if(d > 0) {
				double x2 = (-b - Math.sqrt(d)) / (2 * a);
				System.out.printf("x2=%f\n",x2);
			}
		}
	}
}