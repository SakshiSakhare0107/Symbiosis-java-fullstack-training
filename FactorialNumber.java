import java.util.*;
public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		
		if(n%2==0) {	
		System.out.println("Number is Pelindrom");
		}
		else {
			System.out.println("Number is not pelindrom");
		}
	}
	
}
