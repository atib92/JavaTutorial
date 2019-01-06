package student_db;
import java.util.Scanner;

public class student_app {
	public static void main(String args[]) {
		// ask number of student
		Scanner in = new Scanner(System.in);
		System.out.print("Enter num students:");
		int num_students = in.nextInt();
		System.out.println("num students: "+num_students);
		int i,j,year,NC = 5,nc,c;
		String name;
		int[] my_courses= new int[5];
		for(i=0;i<num_students;i++) {
			System.out.print("Enter Year: ");
			year = in.nextInt();
			System.out.print("Enter Number of courses: ");
			nc = in.nextInt();
			in.nextLine();
			System.out.print("Enter Name: ");
			name = in.nextLine();
			for(j=0;j<nc;j++) {
				//in a switch case, call the enum constructor
				System.out.print(""
						+ "1:History"
						+ "2:Maths"
						+ "3:English"
						+ "4:Chemistry"
						+ "5:Computer Science");
				c = in.nextInt();
				my_courses[c-1] = 1;
			}
			// call student constructor now
			student new_student = new student(name,
					year, NC, my_courses);
			new_student.get_student_info();
		}
		
	}
}
