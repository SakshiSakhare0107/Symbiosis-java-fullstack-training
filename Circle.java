import java.util.*;
public class Circle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Radius : ");
		double radius=sc.nextDouble();
		double area=Math.PI*(radius*radius);
		
		System.out.println("The Area of Circle is : "+area);
		double circumference=Math.PI*2*radius;
		System.out.println("Circumference of the Circle is : "+circumference);
		
		

	}

}
