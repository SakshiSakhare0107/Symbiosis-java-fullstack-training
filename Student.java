
public class Student {

	public static void main(String[] args) {
		int marks=85;
		//int[] studentMarks= {85,92,58,77,69};
		char grade=charcalculateGrade(marks);
		System.out.println("The grade is: "+grade);
		
	}
	public static char charcalculateGrade(int marks) {
		if(marks>=90) {
			return 'A';
		}
		else if(marks>=80) {
			return 'B';
		}
		else if(marks>=70) {
			return 'C';	
		}
		else if(marks>=60) {
			return 'D';
		}
		else {
			return 'F';
		}
	}
	
}
