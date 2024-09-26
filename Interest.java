import java.util.*;
public class Interest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the amount  Principal : ");
		double pr=sc.nextInt();

		System.out.println("Enter the number of years : ");
		double t=sc.nextInt();
		
		System.out.println("Enter the Rate of Interest : ");
		double rate=sc.nextInt();
		
		double simple=(pr*t*rate);
		
		System.out.println("Simple Interest= "+simple);
		
		System.out.println("How many times interest applied : ");
		double num=sc.nextDouble();
		
		double com=pr*(Math.pow((1+rate/num),t));
		System.out.println("Compound Interest= "+com);
		}
}
