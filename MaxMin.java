import java.util.*;
public class MaxMin {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		
		int elements=input.nextInt();
		
		int[] arr=new int[elements];
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<elements;i++) {
			System.out.println("Enter a number:");
			arr[i]=input.nextInt();
			
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		

	}

}
